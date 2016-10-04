package nl.itris.catalog.control;

import nl.itris.catalog.entity.CatalogItem;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by michael on 4-10-16.
 */
public class CatalogValidationTest {

    @Test
    public void validate_catalogItemIsNull_expectFalse() throws Exception {

        // Setup
        CatalogItem item = null;
        CatalogValidation cv = new CatalogValidation();

        // Execute
        boolean result = cv.validate(item);

        // Verify
        Assert.assertFalse(result);
    }

    @Test
    public void validate_catalogItemIsFilled_expectTrue() throws Exception {

        // Setup
        CatalogItem item = new CatalogItem();
        CatalogValidation cv = new CatalogValidation();

        // Execute
        boolean result = cv.validate(item);

        // Verify
        Assert.assertTrue(result);
    }
}
