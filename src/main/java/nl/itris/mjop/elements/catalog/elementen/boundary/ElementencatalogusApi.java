package nl.itris.mjop.elements.catalog.elementen.boundary;

import nl.itris.mjop.elements.catalog.common.boundary.ApiResponseMessage;
import nl.itris.mjop.elements.catalog.common.boundary.NotFoundException;
import nl.itris.mjop.elements.catalog.handelingen.entity.Deelhandeling;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.ArrayList;

@Path("/elementen")
public class ElementencatalogusApi implements ElementencatalogusApiService {

    @PersistenceContext
    EntityManager em;

    @POST
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/json", "application/xml" })
    public Response addElement(Element body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @DELETE
    @Path("/{elementId}")
    @Produces({ "application/json", "application/xml" })
    public Response deleteElement(@HeaderParam("api_key") String apiKey, @PathParam("elementId") Long elementId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @GET
    @Path("/{elementId}")
    @Produces({ "application/json", "application/xml" })
    public Response getElementById(@PathParam("elementId") Long elementId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @GET
    @Produces({ "application/json", "application/xml" })
    public Response getElements(  @QueryParam("page") Integer page, @QueryParam("records per page") Integer recordsPerPage,@Context SecurityContext securityContext)
    throws NotFoundException {
        em.createNamedQuery(Deelhandeling.findAll).getResultList();
        Element el = new Element();
        el.setCode("TST");
        el.setId(new Long(1));
        el.setElementgroep("test");
        el.setOmschrijving("sfsdfsdf");
        ArrayList lst = new ArrayList<Element>();
        lst.add(el);
        return Response.ok().entity(lst).build();
    }
    @PUT
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/json", "application/xml" })
    public Response updateElement( Element body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
