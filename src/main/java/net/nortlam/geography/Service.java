package net.nortlam.geography;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Sorts;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import net.nortlam.geography.setup.MongoProvider;
import org.bson.Document;

@Stateless
public class Service {

    private static final Logger LOG = Logger.getLogger(Service.class.getName());
    
    public static final String DATABASE = "geography";
    public static final String COLLECTION_COUNTRY = "country";
    
    @EJB
    private MongoProvider provider;
    
//    private Collection<Document> fetchAllCountries() {
//        MongoCollection<Document> collection = getCountries();
//        // List of documents sorted by Name
//        // PENDING: There is an option of selecting only the needed fields
//        for(Document document: collection.find().sort(Sorts.ascending("name"))) {
//            
//        }
//    }
    




//    private MongoCollection<Document> getCountries() {
//        try {
//            return provider.getClient().getDatabase(DATABASE).getCollection(COLLECTION_COUNTRY);
//        } catch(IllegalArgumentException ex) {
//            LOG.log(Level.SEVERE, "### ILLEGAL ARGUMENT EXCEPTION:{0}",
//                    ex.getMessage());
//        }
//    }
}
