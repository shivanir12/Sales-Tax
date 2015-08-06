package com.salesTax;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InputOutput inputOutput = new InputOutput();
        ArrayList<String> allItems = new ArrayList<>();
        allItems.add("music cd");
        ArrayList<String> excemptedItems = new ArrayList<>();
        excemptedItems.add("book");
        excemptedItems.add("food");
        excemptedItems.add("medical product")
        ArrayList<String> importedItems = new ArrayList<>();
        importedItems.add("chocolate");
        importedItems.add("perfume");


        PurchasedItems purchasedItems = new PurchasedItems(inputOutput, allItems, excemptedItems, importedItems );
        purchasedItems.getThePurchasedItemDetails();
    }

}
