package net.nortlam.geography;

import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1/country")
public class Resource {

    private static final Logger LOG = Logger.getLogger(Resource.class.getName());
    
    @EJB
    private Service service;
    
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response fetchAll() {
//        
//    }
    
    
}
