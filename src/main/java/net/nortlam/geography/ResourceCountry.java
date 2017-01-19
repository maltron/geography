package net.nortlam.geography;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import net.nortlam.geography.entity.Country;
import net.nortlam.geography.error.NoContentException;

@Path("/v1/country")
public class ResourceCountry {

    private static final Logger LOG = Logger.getLogger(ResourceCountry.class.getName());
    
    @Context
    private UriInfo info;
    
    @EJB
    private ServiceCountry service;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response fetchAll() throws NoContentException {
        Collection<String> queryParameters = queryParameters();
        
        Collection<Country> all = service.fetchAllCountries(queryParameters);
        
        JsonArrayBuilder builder = Json.createArrayBuilder();
        for(Country country: service.fetchAllCountries(queryParameters))
            builder.add(country.toJson(queryParameters));
        
        return Response.ok(builder.build()).build();
    }
    
    @GET @Path("/{internet}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response fetchInternet(@PathParam("internet") String internet) throws NotFoundException {
        Collection<String> queryParameters = queryParameters();
        
        Country found = service.fetchInternet(internet);
        return Response.ok(found.toJson(queryParameters)).build();
    }
    
    /**
     * Used as a means to select which fields needs to be used */
    private Collection<String> queryParameters() {
        Collection<String> queryParameters = new ArrayList<>();
        for(String queryParam: info.getQueryParameters().keySet())
            queryParameters.add(queryParam);
        
        return queryParameters;
    }
    
    
    
}
