package com.salesTax;

import java.util.ArrayList;

public class PurchasedItems {

    private InputOutput inputOutput;
    private final ArrayList<String> allItems;
    private final ArrayList<String> excemptedItems;
    private final ArrayList<String> importedItems;


    public PurchasedItems(InputOutput inputOutput, ArrayList<String> allItems, ArrayList<String> excemptedItems, ArrayList<String> importedItems) {

        this.inputOutput = inputOutput;
        this.allItems = allItems;
        this.excemptedItems = excemptedItems;
        this.importedItems = importedItems;
    }
    public void getThePurchasedItemDetails (){
        String[] items = {};
        inputOutput.display("enter the number of items to be purchased");
        int numberOfIems = Integer.parseInt(inputOutput.getStringInput());
        for(int i=0; i< numberOfIems; i++) {
            items[i] = inputOutput.getStringInput();
            String itemDetails[] = items[i].split("at");
            getCostAndQuantityOfItem(itemDetails[0], itemDetails[1]);
        }
    }

    private void getCostAndQuantityOfItem(String itemNameAndQuantity, String itemCost) {
        String itemName = null;
        int costOfItem = 0;
        if(itemNameAndQuantity.contains("imported")){
            itemName = itemNameAndQuantity.substring(10);
            costOfItem = Integer.parseInt(itemCost);
            if(allItems.contains(itemName))
                costOfItem = costOfItem + (costOfItem*10)/100;
            else if(importedItems.contains(itemName))
                costOfItem = costOfItem + (costOfItem*5)/100;
            

        }
        else {

            itemName = itemNameAndQuantity.substring(2);
            costOfItem = Integer.parseInt(itemCost);
        }
    }
}
