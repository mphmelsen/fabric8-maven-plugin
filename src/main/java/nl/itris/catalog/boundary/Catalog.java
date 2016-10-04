package nl.itris.catalog.boundary;

import nl.itris.catalog.control.CatalogValidation;
import nl.itris.catalog.entity.CatalogItem;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import java.util.List;

/**
 * Created by michael on 30-9-16.
 */
@Stateless
@Path("catalog")
public class Catalog {
    @PersistenceContext
    private EntityManager em;

    @Context
    UriInfo uriInfo;

    @Inject
    CatalogValidation validation;

    @PostConstruct
    public void init() {
        System.out.println("base URI: " + uriInfo.getBaseUri());
        System.out.println("request URI: " + uriInfo.getRequestUri());
    }

    @POST
    @Consumes({"application/xml", "application/json"})
    public void create(CatalogItem entity) {

        if(validation.validate(entity)) {
            em.persist(entity);
        }
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, CatalogItem entity) {

        if(validation.validate(entity)) {
            em.merge(entity);
        }
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        em.remove(find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml; qs=0.50", "application/json"})
    public CatalogItem find(@PathParam("id") Integer id) {
        return em.createNamedQuery("Item.findById", CatalogItem.class).setParameter("id", id).getSingleResult();
    }

    @GET
    @Produces({"application/xml", "application/json"})
    public List<CatalogItem> findAll() {
        return em.createNamedQuery("Item.findAll", CatalogItem.class).getResultList();
    }
}
