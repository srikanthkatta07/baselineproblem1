package com.thoughtworks.baseline;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class PriceCalculatorTest {

    @Test
    public void shouldCalculatesTotalPriceOfItemsInTheItemListWhenNoItemsArePresentInTheItemList() {
        List<String> items = new ArrayList<>();
        BasicItem basicItem = new BasicItem();

        PriceCalculator priceCalculator = new PriceCalculator(items, basicItem);

        assertEquals(0.0, priceCalculator.calculatesTotalPriceAlongWithSalesTax(), 0.2d);
    }

    @Test
    public void shouldCalculatesTotalPriceOfItemsInTheItemListWhenOnlyItemIsPresentInTheItemList() {
        List<String> items = new ArrayList<>();
        BasicItem basicItem = new BasicItem();

        items.add("1 book at 12.49");

        PriceCalculator priceCalculator = new PriceCalculator(items, basicItem);

        assertEquals(12.49, priceCalculator.calculatesTotalPriceAlongWithSalesTax(), 0.2d);
    }

    @Test
    public void shouldCalculatesTotalPriceOfItemsInTheItemListWhenMoreThanOneItemIsPresentInTheItemList() {
        List<String> items = new ArrayList<>();
        BasicItem basicItem = new BasicItem();

        items.add("1 book at 12.49");
        items.add("1 music CD at 14.99");
        items.add("1 chocolate bar at 0.85");

        PriceCalculator priceCalculator = new PriceCalculator(items, basicItem);

        assertEquals(29.914, priceCalculator.calculatesTotalPriceAlongWithSalesTax(), 0.2d);
    }

    @Test
    public void shouldCalculatesTotalPriceOfItemsInTheItemListWhenOneImportedItemPresentInTheItemList() {
        List<String> items = new ArrayList<>();
        BasicItem basicItem = new BasicItem();

        items.add("1 imported book at 12.49");

        PriceCalculator priceCalculator = new PriceCalculator(items, basicItem);

        assertEquals(13.114, priceCalculator.calculatesTotalPriceAlongWithSalesTax(), 0.2d);
    }

    @Test
    public void shouldCalculatesTotalPriceOfItemsInTheItemListWhenMoreThanOneImportedItemPresentInTheItemList() {
        List<String> items = new ArrayList<>();
        BasicItem basicItem = new BasicItem();

        items.add("1 imported book at 12.49");
        items.add("1 imported CD at 12.49");

        PriceCalculator priceCalculator = new PriceCalculator(items, basicItem);

        assertEquals(27.478, priceCalculator.calculatesTotalPriceAlongWithSalesTax(), 0.2d);
    }
}
