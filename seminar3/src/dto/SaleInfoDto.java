package DTO;

import model.Item;
import java.util.Date;

import java.util.LinkedList;

public class SaleInfoDto
{
    private int totalCost;
    private Date saleTime;
    private LinkedList<Item> listOfItems;
    private Item lastItem;

    public SaleInfoDto(LinkedList listOfItemsint, int totalCost, Date saleTime, Item lastItem)
    {
        this.totalCost = totalCost;
        this.lastItem = lastItem;
        //this.itemInfo = itemInfo;
        this.saleTime = saleTime;
        this.listOfItems = listOfItemsint;
    }

    // här lagras den slutliga kostnaden och alla item info
    public int getTotalCost ()
    {
        return totalCost;
    }

    public Item getlastItem()
    {
        return lastItem;
    }


}
