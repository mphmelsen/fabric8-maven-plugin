package nl.itris.mjop.elementen.boundary;

import nl.itris.common.ApiResponseMessage;
import org.jboss.resteasy.annotations.GZIP;
import org.jboss.resteasy.links.AddLinks;
import org.jboss.resteasy.links.LinkResource;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.HashMap;
import java.util.Map;

@Path("/elementen")
public class ElementencatalogusApi implements ElementencatalogusApiService {

    private static Map<Long, Element> data = new HashMap<Long,Element>();
    static {
        Element el = new Element();
        el.setCode("TST");
        el.setId(new Long(1));
        el.setElementgroep("test");
        el.setOmschrijving("sfsdfsdf");
        data.put(el.getId(), el);
        el = new Element();
        el.setCode("TST");
        el.setId(new Long(2));
        el.setElementgroep("test");
        el.setOmschrijving("sfsdfsdf");
        data.put(el.getId(), el);
        el = new Element();
        el.setCode("TST");
        el.setId(new Long(3));
        el.setElementgroep("test");
        el.setOmschrijving("sfsdfsdf");
        data.put(el.getId(), el);
        el = new Element();
        el.setCode("TST");
        el.setId(new Long(4));
        el.setElementgroep("test");
        el.setOmschrijving("sfsdfsdf");
        data.put(el.getId(), el);
    }

    @PersistenceContext
    EntityManager em;

    @AddLinks
    @LinkResource(value = Element.class)
    @GET
    @Produces({ "application/json", "application/xml" })
    @GZIP
    public Response getElements(  @QueryParam("page") Integer page, @QueryParam("records per page") Integer recordsPerPage,@Context SecurityContext securityContext)
            throws nl.itris.common.NotFoundException {
    //    em.createNamedQuery(nl.itris.mjop.handelingen.entity.Deelhandeling.findAll).getResultList();
        Response.ResponseBuilder builder = Response.ok().entity(data.values());
        builder.header("ETag", "234234");
        return builder.build();
    }

    @POST
    @LinkResource
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/json", "application/xml" })
    public Response addElement(Element body,@Context SecurityContext securityContext)
    throws nl.itris.common.NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @DELETE
    @LinkResource(value = Element.class)
    @Path("/{elementId}")
    @Produces({ "application/json", "application/xml" })
    public Response deleteElement(@HeaderParam("api_key") String apiKey, @PathParam("elementId") Long elementId,@Context SecurityContext securityContext)
    throws nl.itris.common.NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK,"deleted")).build();
    }
    @GET
    @LinkResource
    @Path("/{elementId}")
    @Produces({ "application/json", "application/xml" })
    @GZIP
    public Response getElementById(@PathParam("elementId") Long elementId,@Context SecurityContext securityContext)
    throws nl.itris.common.NotFoundException {
        return Response.ok().entity(data.get(elementId)).build();
    }
    @PUT
    @LinkResource
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/json", "application/xml" })
    public Response updateElement( Element body,@Context SecurityContext securityContext)
    throws nl.itris.common.NotFoundException {
        data.put(body.getId(), body);
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK,"updated")).build();
    }
}
