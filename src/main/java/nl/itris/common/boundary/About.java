package nl.itris.common.boundary;

import javax.activation.MimeType;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by michael on 30-9-16.
 */
@Stateless
@Path("about")
public class About {

    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String about() {
        return About.class.getResourceAsStream("/buildNumber.properties").toString();
    }

}