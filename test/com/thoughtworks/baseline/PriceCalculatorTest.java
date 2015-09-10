package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriceCalculatorTest {

    @Test
    public void shouldCalculatesTotalPriceOfItemsInTheItemListWhenNoItemsArePresentInTheItemList() {
        PriceCalculator priceCalculator = new PriceCalculator("");

        assertEquals(0.0, priceCalculator.CalculatesTotalPriceAlongWithSalesTax(), 0.2d);
    }

    @Test
    public void shouldCalculatesTotalPriceOfItemsInTheItemListWhenOnlyItemIsPresentInTheItemList() {
        PriceCalculator priceCalculator = new PriceCalculator("1 book at 12.49");

        assertEquals(12.49, priceCalculator.CalculatesTotalPriceAlongWithSalesTax(), 0.2d);
    }
}
