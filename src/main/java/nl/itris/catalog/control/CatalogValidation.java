package nl.itris.catalog.control;

import nl.itris.catalog.entity.CatalogItem;

/**
 * Created by michael on 4-10-16.
 */
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
