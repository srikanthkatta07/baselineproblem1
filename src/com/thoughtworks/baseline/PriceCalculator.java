package com.thoughtworks.baseline;

import java.util.*;

public class PriceCalculator {

    private List<String> items;
    private double totalPrice;

    public PriceCalculator(List<String> items) {
        this.items = items;
    }

    public double CalculatesTotalPriceAlongWithSalesTax() {
        if (items.size() == 0)
            return 0;
        else {
            for (String item : items) {
                String[] words = item.split(" ");
                double itemPrice = Double.parseDouble(words[words.length - 1]);
                if (words[1].equals("book"))
                    totalPrice = totalPrice + itemPrice;
                else
                    totalPrice = totalPrice + itemPrice + ((itemPrice * 5) / 100);
            }
            return totalPrice;
        }
    }
}
