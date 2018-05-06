package se.kth.iv1201.pos.model;

import se.kth.iv1201.pos.dto.SaleInfoDto;

import java.lang.StringBuilder;
import java.util.LinkedList;

public class Reciept {
    private StringBuilder kvitto = new StringBuilder();
    private double cost;
    private LinkedList<Item> items;




   public Reciept(SaleInfoDto saleInfoDto){
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
