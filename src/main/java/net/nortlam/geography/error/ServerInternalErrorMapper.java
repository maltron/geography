package net.nortlam.geography.error;

import java.util.logging.Logger;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@Provider
public class ServerInternalErrorMapper implements ExceptionMapper<ServerInternalErrorException> {

    private static final Logger LOG = Logger.getLogger(ServerInternalErrorMapper.class.getName());

    public ServerInternalErrorMapper() {
    }

    @Override
    public Response toResponse(ServerInternalErrorException ex) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
    }
}
