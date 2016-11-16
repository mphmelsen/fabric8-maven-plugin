package nl.itris.mjop.elementen.boundary;

import io.swagger.annotations.ApiParam;
import nl.itris.common.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

/**
 * @author <a href="mailto:bart.van.de.klundert@itris.nl">Bart van de Klundert</a>
 *         Created on 15-11-16.
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-11-10T14:14:22.733Z")
@io.swagger.annotations.Api(description = "the elementen API")
public interface ElementencatalogusApiService {
    @io.swagger.annotations.ApiOperation(value = "Een collectie met daarin alle elementen", notes = "Toevoegen van een nieuw element aan de elementen collectie", response = void.class, authorizations = {
            @io.swagger.annotations.Authorization(value = "OauthSecurity", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "Admin scope"),
                    @io.swagger.annotations.AuthorizationScope(scope = "user", description = "User scope")
            })
    }, tags={ "elementen", })
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = void.class) })
    public Response addElement(@io.swagger.annotations.ApiParam(value = "element object that needs to be created and added to the collection" ) Element body,SecurityContext securityContext)
            throws NotFoundException;

    @io.swagger.annotations.ApiOperation(value = "Delete an element", notes = "", response = void.class, authorizations = {
            @io.swagger.annotations.Authorization(value = "OauthSecurity", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "Admin scope"),
                    @io.swagger.annotations.AuthorizationScope(scope = "user", description = "User scope")
            })
    }, tags={ "element", })
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid element value", response = void.class) })
    public Response deleteElement(@ApiParam(value = "" ,required=true)String apiKey,@ApiParam(value = "Element id to delete",required=true) Long elementId,SecurityContext securityContext)
            throws NotFoundException;

    @io.swagger.annotations.ApiOperation(value = "Find element by ID", notes = "Returns a specific element", response = Element.class, authorizations = {
            @io.swagger.annotations.Authorization(value = "OauthSecurity", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "Admin scope"),
                    @io.swagger.annotations.AuthorizationScope(scope = "user", description = "User scope")
            })
    }, tags={ "element", })
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Element.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Element.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "Element not found", response = Element.class) })
    public Response getElementById( @ApiParam(value = "ID of element that needs to be fetched",required=true) Long elementId,SecurityContext securityContext)
            throws NotFoundException;

    @io.swagger.annotations.ApiOperation(value = "Find all elements", notes = "Returns a list with elements", response = Element.class, responseContainer = "List", authorizations = {
            @io.swagger.annotations.Authorization(value = "OauthSecurity", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "Admin scope"),
                    @io.swagger.annotations.AuthorizationScope(scope = "user", description = "User scope")
            })
    }, tags={ "elementen", })
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Element.class, responseContainer = "List"),

            @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Element.class, responseContainer = "List"),

            @io.swagger.annotations.ApiResponse(code = 404, message = "Element not found", response = Element.class, responseContainer = "List") })
    public Response getElements(@ApiParam(value = "the requested page number (1 based)") Integer page,@ApiParam(value = "records returned per page") Integer recordsPerPage,SecurityContext securityContext)
            throws NotFoundException;

    @io.swagger.annotations.ApiOperation(value = "Update existing element", notes = "", response = void.class, authorizations = {
            @io.swagger.annotations.Authorization(value = "OauthSecurity", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "Admin scope"),
                    @io.swagger.annotations.AuthorizationScope(scope = "user", description = "User scope")
            })
    }, tags={ "elementen", })
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = void.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "Element not found", response = void.class),

            @io.swagger.annotations.ApiResponse(code = 405, message = "Validation exception", response = void.class) })
    public Response updateElement(@ApiParam(value = "Element that will be updated" ) Element body,SecurityContext securityContext)
            throws NotFoundException;
}
