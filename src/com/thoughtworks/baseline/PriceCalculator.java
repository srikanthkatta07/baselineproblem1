package com.thoughtworks.baseline;

import java.util.*;

public class PriceCalculator {

    private List<String> items;
    private double totalPrice;
    private BasicItem basicItem;

    public PriceCalculator(List<String> items, BasicItem basicItem) {
        this.items = items;
        this.basicItem = basicItem;
    }

    public double calculatesTotalPriceAlongWithSalesTax() {
        if (items.size() == 0)
            return 0;
        else {
            for (String item : items) {
                String[] words = item.split(" ");
                double itemPrice = Double.parseDouble(words[words.length - 1]);
                if (!words[1].equals("imported")) {
                    basicItem = new BasicItem();
                    if (words[1].equals("book"))
                        totalPrice = totalPrice + calculateEachItemPrice(itemPrice, basicItem.getTax());
                    else
                        totalPrice = totalPrice + calculateEachItemPrice(itemPrice, 10);
                }
                else {
                    if(words[2].equals("book"))
                        totalPrice = totalPrice + calculateEachItemPrice(itemPrice, 5);
                    else
                        totalPrice = totalPrice + calculateEachItemPrice(itemPrice, 15);
                }
            }
            return totalPrice;
        }
    }

    public double calculateEachItemPrice(double itemPrice, double tax) {
        return itemPrice + ((itemPrice * tax) / 100);
    }
}
