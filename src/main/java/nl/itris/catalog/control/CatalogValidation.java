package nl.itris.catalog.control;

import nl.itris.catalog.entity.CatalogItem;

import javax.enterprise.context.Dependent;

/**
 * Created by michael on 4-10-16.
 */
@Dependent
public class CatalogValidation {

    /**
     * validate the incoming item
     *
     * @param item
     * @return
     */
    public boolean validate(CatalogItem item) {
        return item != null;
    }
}
