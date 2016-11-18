package nl.itris.mjop.elements.catalog.common.boundary;

import io.swagger.jaxrs.config.BeanConfig;
import nl.itris.mjop.elements.catalog.elementen.boundary.ElementencatalogusApi;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class RestApplication extends Application {

    public RestApplication() {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8002");
        beanConfig.setBasePath("/api");
        beanConfig.setDescription("de elementcatalogus API");
        beanConfig.setResourcePackage("nl.itris.mjop,nl.itris.mjop.api,nl.itris.mjop.application.representation,nl.itris.mjop.resource");
        beanConfig.setScan(true);
    }

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet();
        resources.add(ElementencatalogusApi.class);
        resources.add(io.swagger.jaxrs.listing.ApiListingResource.class);
        resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);

        return resources;
    }
}
