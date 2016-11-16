package nl.itris.mjop.recepten.boundary;

import io.swagger.annotations.ApiParam;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

/**
 * @author <a href="mailto:bart.van.de.klundert@itris.nl">Bart van de Klundert</a>
 *         Created on 15-11-16.
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-16T10:57:20.256Z")
@io.swagger.annotations.Api(description = "the recepten API")
public interface ReceptenApiService {
        @io.swagger.annotations.ApiOperation(value = "Een collectie met daarin alle recepten", notes = "Toevoegen van een nieuw element aan de recepten collectie", response = void.class, authorizations = {
                @io.swagger.annotations.Authorization(value = "OauthSecurity", scopes = {
                        @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "Admin scope"),
                        @io.swagger.annotations.AuthorizationScope(scope = "user", description = "User scope")
                })
        }, tags={ "recepten", })
        @io.swagger.annotations.ApiResponses(value = {
                @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = void.class) })
        public Response addRecept(@ApiParam(value = "Recept object that needs to be created and added to the collection" ) Recept body
                ,@Context SecurityContext securityContext)
                throws javax.ws.rs.NotFoundException;
        @io.swagger.annotations.ApiOperation(value = "Een collectie met daarin alle receptregels", notes = "Toevoegen van een nieuw receptregel aan de receptregels collectie", response = void.class, authorizations = {
                @io.swagger.annotations.Authorization(value = "OauthSecurity", scopes = {
                        @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "Admin scope"),
                        @io.swagger.annotations.AuthorizationScope(scope = "user", description = "User scope")
                })
        }, tags={ "receptregels", })
        @io.swagger.annotations.ApiResponses(value = {
                @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = void.class) })
        public Response addReceptregel(@ApiParam(value = "ID of element that needs to be fetched",required=true) @PathParam("receptId") Long receptId
                ,@ApiParam(value = "Receptregel object that needs to be created and added to the collection" ) Receptregel body
                ,@Context SecurityContext securityContext)
                throws javax.ws.rs.NotFoundException;
        @io.swagger.annotations.ApiOperation(value = "Delete an recept", notes = "", response = void.class, authorizations = {
                @io.swagger.annotations.Authorization(value = "OauthSecurity", scopes = {
                        @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "Admin scope"),
                        @io.swagger.annotations.AuthorizationScope(scope = "user", description = "User scope")
                })
        }, tags={ "recept", })
        @io.swagger.annotations.ApiResponses(value = {
                @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid element value", response = void.class) })
        public Response deleteRecept(@ApiParam(value = "" ,required=true)@HeaderParam("api_key") String apiKey
                ,@ApiParam(value = "Recept id to delete",required=true) @PathParam("receptId") Long receptId
                ,@Context SecurityContext securityContext)
                throws javax.ws.rs.NotFoundException;
        @io.swagger.annotations.ApiOperation(value = "Find recept by ID", notes = "Returns a specific recept", response = Recept.class, responseContainer = "List", authorizations = {
                @io.swagger.annotations.Authorization(value = "OauthSecurity", scopes = {
                        @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "Admin scope"),
                        @io.swagger.annotations.AuthorizationScope(scope = "user", description = "User scope")
                })
        }, tags={ "recept", })
        @io.swagger.annotations.ApiResponses(value = {
                @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Recept.class, responseContainer = "List"),

                @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Recept.class, responseContainer = "List"),

                @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Recept.class, responseContainer = "List"),

                @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Recept.class, responseContainer = "List"),

                @io.swagger.annotations.ApiResponse(code = 404, message = "Not found", response = Recept.class, responseContainer = "List") })
        public Response getReceptById(@ApiParam(value = "ID of element that needs to be fetched",required=true) @PathParam("receptId") Long receptId
                ,@ApiParam(value = "the requested page number (1 based)") @QueryParam("page") Integer page
                ,@ApiParam(value = "records returned per page") @QueryParam("records per page") Integer recordsPerPage
                ,@ApiParam(value = "a comma separated string that determines the fields that need to be returned see http://www.itris.nl/selecting") @QueryParam("select") String select
                ,@ApiParam(value = "a comma separated string containing sub entities that need to be returned expanded see http://www.itris.nl/expanding") @QueryParam("expand") String expand
                ,@ApiParam(value = "a filter that can be used to filter te requested entity, all fields of the entity can be used to filter for explanation about the filter possibilities see http://www.itris.nl/filtering") @QueryParam("filter") String filter
                ,@Context SecurityContext securityContext)
                throws javax.ws.rs.NotFoundException;
        @io.swagger.annotations.ApiOperation(value = "Find all receptregels", notes = "Returns a list with receptregels", response = Receptregel.class, responseContainer = "List", authorizations = {
                @io.swagger.annotations.Authorization(value = "OauthSecurity", scopes = {
                        @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "Admin scope"),
                        @io.swagger.annotations.AuthorizationScope(scope = "user", description = "User scope")
                })
        }, tags={ "receptregels", })
        @io.swagger.annotations.ApiResponses(value = {
                @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Receptregel.class, responseContainer = "List"),

                @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Receptregel.class, responseContainer = "List"),

                @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Receptregel.class, responseContainer = "List"),

                @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Receptregel.class, responseContainer = "List"),

                @io.swagger.annotations.ApiResponse(code = 404, message = "Not found", response = Receptregel.class, responseContainer = "List") })
        public Response getReceptRules(@ApiParam(value = "ID of element that needs to be fetched",required=true) @PathParam("receptId") Long receptId
                ,@ApiParam(value = "the requested page number (1 based)") @QueryParam("page") Integer page
                ,@ApiParam(value = "records returned per page") @QueryParam("records per page") Integer recordsPerPage
                ,@ApiParam(value = "a comma separated string that determines the fields that need to be returned see http://www.itris.nl/selecting") @QueryParam("select") String select
                ,@ApiParam(value = "a comma separated string containing sub entities that need to be returned expanded see http://www.itris.nl/expanding") @QueryParam("expand") String expand
                ,@ApiParam(value = "a filter that can be used to filter te requested entity, all fields of the entity can be used to filter for explanation about the filter possibilities see http://www.itris.nl/filtering") @QueryParam("filter") String filter
                ,@Context SecurityContext securityContext)
                throws javax.ws.rs.NotFoundException;
        @io.swagger.annotations.ApiOperation(value = "Find all recepten", notes = "Returns a list with recepten", response = Recept.class, responseContainer = "List", authorizations = {
                @io.swagger.annotations.Authorization(value = "OauthSecurity", scopes = {
                        @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "Admin scope"),
                        @io.swagger.annotations.AuthorizationScope(scope = "user", description = "User scope")
                })
        }, tags={ "recepten", })
        @io.swagger.annotations.ApiResponses(value = {
                @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Recept.class, responseContainer = "List"),

                @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Recept.class, responseContainer = "List"),

                @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Recept.class, responseContainer = "List"),

                @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Recept.class, responseContainer = "List"),

                @io.swagger.annotations.ApiResponse(code = 404, message = "Not found", response = Recept.class, responseContainer = "List") })
        public Response getRecepts(@ApiParam(value = "the requested page number (1 based)") @QueryParam("page") Integer page
                ,@ApiParam(value = "records returned per page") @QueryParam("records per page") Integer recordsPerPage
                ,@ApiParam(value = "a comma separated string that determines the fields that need to be returned see http://www.itris.nl/selecting") @QueryParam("select") String select
                ,@ApiParam(value = "a comma separated string containing sub entities that need to be returned expanded see http://www.itris.nl/expanding") @QueryParam("expand") String expand
                ,@ApiParam(value = "a filter that can be used to filter te requested entity, all fields of the entity can be used to filter for explanation about the filter possibilities see http://www.itris.nl/filtering") @QueryParam("filter") String filter
                ,@Context SecurityContext securityContext)
                throws javax.ws.rs.NotFoundException;
        @io.swagger.annotations.ApiOperation(value = "Update existing recept", notes = "", response = void.class, authorizations = {
                @io.swagger.annotations.Authorization(value = "OauthSecurity", scopes = {
                        @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "Admin scope"),
                        @io.swagger.annotations.AuthorizationScope(scope = "user", description = "User scope")
                })
        }, tags={ "recepten", })
        @io.swagger.annotations.ApiResponses(value = {
                @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 404, message = "Element not found", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 405, message = "Validation exception", response = void.class) })
        public Response updateRecept(@ApiParam(value = "Element that will be updated" ) Recept body
                ,@Context SecurityContext securityContext)
                throws javax.ws.rs.NotFoundException;
        @io.swagger.annotations.ApiOperation(value = "Update existing receptregel", notes = "", response = void.class, authorizations = {
                @io.swagger.annotations.Authorization(value = "OauthSecurity", scopes = {
                        @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "Admin scope"),
                        @io.swagger.annotations.AuthorizationScope(scope = "user", description = "User scope")
                })
        }, tags={ "receptregels", })
        @io.swagger.annotations.ApiResponses(value = {
                @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 404, message = "Element not found", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 405, message = "Validation exception", response = void.class) })
        public Response updateReceptregel(@ApiParam(value = "ID of element that needs to be fetched",required=true) @PathParam("receptId") Long receptId
                ,@ApiParam(value = "Receptregel that will be updated" ) Receptregel body
                ,@Context SecurityContext securityContext)
                throws javax.ws.rs.NotFoundException;
    }
