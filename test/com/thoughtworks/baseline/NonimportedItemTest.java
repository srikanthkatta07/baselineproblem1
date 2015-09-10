package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonimportedItemTest {

    @Test
    public void shouldHaveTaxEqualToZeroWhenItIsNonImportedBasicItem() {
        NonImportedItem nonImportedItem = new NonImportedItem();

        assertEquals(0.0, nonImportedItem.getTax(), 0.2d);
    }
}
