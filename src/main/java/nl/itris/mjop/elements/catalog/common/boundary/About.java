package nl.itris.mjop.elements.catalog.common.boundary;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by michael on 30-9-16.
 */
@Stateless
@Path("about")
public class About {

    private static final Properties properties;

    /** Use a static initializer to read from file. */
    static {
        InputStream inputStream = About.class.getResourceAsStream("/buildNumber.properties");
        properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read properties file", e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    // Ignore
                }
            }
        }
    }

    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public Response about() {

        return Response.ok(properties.getProperty("git-sha-1")).build();
    }

}
