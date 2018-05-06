package model;

import java.lang.StringBuilder;
import java.util.LinkedList;

public class Reciept {
    private StringBuilder kvitto = new StringBuilder();
    private double cost;
    private LinkedList<Item> items;



    /**
     * Skapar en ny forum
     * @param itemCost kostnaden för item
     * @param list lista av valda item
     */


   public Reciept(DTO.SaleInfoDto saleInfoDto){
        cost = saleInfoDto.getTotalCost();
        items = saleInfoDto.getItems();


       for (Item currentItem : items)
       {
            kvitto.append(currentItem.getItemName() + ", Price: " + currentItem.getItemCost() + "\n");
       }
    }

    public String getSBToString()
    {
        return kvitto.toString();
    }

    public double getCost()
    {
        return cost;
    }

}
