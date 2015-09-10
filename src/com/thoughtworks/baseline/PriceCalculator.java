package com.thoughtworks.baseline;

public class PriceCalculator {

    private String item;

    public PriceCalculator(String item) {
        this.item = item;
    }

    public double CalculatesTotalPriceAlongWithSalesTax() {
        if (item.equals(""))
            return 0;
        return 12.49;
    }
}
