package net.nortlam.geography;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Sorts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.NotFoundException;
import net.nortlam.geography.entity.Country;
import net.nortlam.geography.error.NoContentException;
import net.nortlam.geography.setup.MongoProvider;
import org.bson.Document;

@Stateless
public class ServiceCountry {

    private static final Logger LOG = Logger.getLogger(ServiceCountry.class.getName());
    
    public static final String DATABASE = "geography";
    
    @EJB
    private MongoProvider provider;
    
    public Collection<Country> fetchAllCountries(Collection<String> fields) throws NoContentException {
        boolean hasProjection = !fields.isEmpty();
        Document projection = new Document();
        if(hasProjection) for(String field: fields) projection.append(field, 1);
        
        // List of documents sorted by Name
        Collection<Country> result = new ArrayList<>();
        for(Document document: hasProjection ? getCountries().find()
                 .projection(projection).sort(Sorts.ascending(Country.TAG_NAME)) :
                getCountries().find().sort(Sorts.ascending(Country.TAG_NAME)))
            result.add(new Country(document));
        
        if(result.isEmpty()) throw new NoContentException();
        
        return result;
    }
    
    public Country fetchInternet(String internet) throws NotFoundException {
        Document document = getCountries().find(
                Filters.eq(Country.TAG_INTERNET, internet)).first();
        if(document == null) throw new NotFoundException();
        
        return new Country(document);
    }

    private MongoCollection<Document> getCountries() {
        return provider.getClient().getDatabase(DATABASE).getCollection(Country.COLLECTION);
    }
}
