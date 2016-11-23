package nl.itris.mjop.elements.catalog.normkosten.boundary;

import nl.itris.mjop.elements.catalog.common.boundary.ApiResponseMessage;

import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/normkosten")


@io.swagger.annotations.Api(description = "the normkosten API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-16T10:57:20.256Z")
@Stateless
public class NormkostenApi  {
    @POST
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/json", "application/xml" })
    public Response addNormkosten(Normkosten body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @GET
    @Produces({ "application/json", "application/xml" })
    public Response getNormcosts(@QueryParam("page") Integer page
,@QueryParam("records per page") Integer recordsPerPage
,@QueryParam("select") String select
,@QueryParam("expand") String expand
,@QueryParam("filter") String filter
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @PUT
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/json", "application/xml" })
    public Response updateNormkosten(Normkosten body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
