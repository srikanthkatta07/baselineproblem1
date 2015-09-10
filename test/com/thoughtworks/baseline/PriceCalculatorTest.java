package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriceCalculatorTest {

    @Test
    public void shouldCalculatesTotalPriceOfItemsInTheItemListWhenNoItemsArePresentInTheItemList() {
        PriceCalculator priceCalculator = new PriceCalculator();

        assertEquals(0.0, priceCalculator.CalculatesTotalPriceAlongWithSalesTax(), 0.2d);
    }
}
