package nl.itris.mjop.elements.catalog.recepten.boundary;

import io.swagger.annotations.ApiParam;
import nl.itris.mjop.elements.catalog.common.boundary.ApiResponseMessage;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/recepten")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-16T10:57:20.256Z")
public class ReceptenApi implements ReceptenApiService {
    @POST
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/json", "application/xml" })
    public Response addRecept(Recept body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @POST
    @Path("/{receptId}/receptregels")
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/json", "application/xml" })
    public Response addReceptregel(@PathParam("receptId") Long receptId
,Receptregel body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @DELETE
    @Path("/{receptId}")
    @Produces({ "application/json", "application/xml" })
    public Response deleteRecept(@HeaderParam("api_key") String apiKey
,@PathParam("receptId") Long receptId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @GET
    @Path("/{receptId}")
    @Produces({ "application/json", "application/xml" })
    public Response getReceptById( @PathParam("receptId") Long receptId
, @QueryParam("page") Integer page
, @QueryParam("records per page") Integer recordsPerPage
, @QueryParam("select") String select
, @QueryParam("expand") String expand
, @QueryParam("filter") String filter
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @GET
    @Path("/{receptId}/receptregels")
    @Produces({ "application/json", "application/xml" })
    public Response getReceptRules(@ApiParam(value = "ID of element that needs to be fetched",required=true) @PathParam("receptId") Long receptId
, @QueryParam("page") Integer page
, Integer recordsPerPage
, @QueryParam("select") String select
, @QueryParam("expand") String expand
, @QueryParam("filter") String filter
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @GET
    @Produces({ "application/json", "application/xml" })
    public Response getRecepts(@QueryParam("page") Integer page
,Integer recordsPerPage
, @QueryParam("select") String select
, @QueryParam("expand") String expand
, @QueryParam("filter") String filter
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @PUT
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/json", "application/xml" })
    public Response updateRecept(Recept body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @PUT
    @Path("/{receptId}/receptregels")
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/json", "application/xml" })
    public Response updateReceptregel(@PathParam("receptId") Long receptId
,Receptregel body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
