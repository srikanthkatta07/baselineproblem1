package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicItemTest {

    @Test
    public void shouldHaveTaxEqualToZeroWhenItIsNonImported() {
        BasicItem basicItemitem = new BasicItem();

        assertEquals(0.0, basicItemitem.getTax(), 0.2d);
    }
}
