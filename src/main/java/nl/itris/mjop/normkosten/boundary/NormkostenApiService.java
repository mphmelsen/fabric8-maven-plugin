package nl.itris.mjop.normkosten.boundary;

import io.swagger.annotations.ApiParam;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@io.swagger.annotations.Api(description = "the normkosten API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-16T10:57:20.256Z")
public interface NormkostenApiService {
        @io.swagger.annotations.ApiOperation(value = "Een collectie met daarin alle normkosten", notes = "Toevoegen van een nieuw normkost aan de normkosten collectie", response = void.class, authorizations = {
                @io.swagger.annotations.Authorization(value = "OauthSecurity", scopes = {
                        @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "Admin scope"),
                        @io.swagger.annotations.AuthorizationScope(scope = "user", description = "User scope")
                })
        }, tags={ "normkosten", })
        @io.swagger.annotations.ApiResponses(value = {
                @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = void.class) })
        public Response addNormkosten(@ApiParam(value = "Normkosten object that needs to be created and added to the collection" ) Normkosten body
                ,@Context SecurityContext securityContext)
                throws NotFoundException;
        @io.swagger.annotations.ApiOperation(value = "Find all normkosten", notes = "Returns a list with normkosten", response = Normkosten.class, responseContainer = "List", authorizations = {
                @io.swagger.annotations.Authorization(value = "OauthSecurity", scopes = {
                        @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "Admin scope"),
                        @io.swagger.annotations.AuthorizationScope(scope = "user", description = "User scope")
                })
        }, tags={ "normkosten", })
        @io.swagger.annotations.ApiResponses(value = {
                @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Normkosten.class, responseContainer = "List"),

                @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Normkosten.class, responseContainer = "List"),

                @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Normkosten.class, responseContainer = "List"),

                @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Normkosten.class, responseContainer = "List"),

                @io.swagger.annotations.ApiResponse(code = 404, message = "Not found", response = Normkosten.class, responseContainer = "List") })
        public Response getNormcosts(@ApiParam(value = "the requested page number (1 based)") Integer page
                ,@ApiParam(value = "records returned per page") Integer recordsPerPage
                ,@ApiParam(value = "a comma separated string that determines the fields that need to be returned see http://www.itris.nl/selecting") String select
                ,@ApiParam(value = "a comma separated string containing sub entities that need to be returned expanded see http://www.itris.nl/expanding") String expand
                ,@ApiParam(value = "a filter that can be used to filter te requested entity, all fields of the entity can be used to filter for explanation about the filter possibilities see http://www.itris.nl/filtering") String filter
                ,@Context SecurityContext securityContext)
                throws NotFoundException;
        @io.swagger.annotations.ApiOperation(value = "Update existing normkosten", notes = "", response = void.class, authorizations = {
                @io.swagger.annotations.Authorization(value = "OauthSecurity", scopes = {
                        @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "Admin scope"),
                        @io.swagger.annotations.AuthorizationScope(scope = "user", description = "User scope")
                })
        }, tags={ "normkosten", })
        @io.swagger.annotations.ApiResponses(value = {
                @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 404, message = "Element not found", response = void.class),

                @io.swagger.annotations.ApiResponse(code = 405, message = "Validation exception", response = void.class) })
        public Response updateNormkosten(@ApiParam(value = "Normkosten that will be updated" ) Normkosten body
                ,@Context SecurityContext securityContext)
                throws NotFoundException;
    }
