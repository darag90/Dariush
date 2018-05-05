package DTO;

import model.Item;
import java.util.Date;

import java.util.LinkedList;

public class SaleInfoDto
{
    private double totalCost;
    private Date saleTime;
    private LinkedList<Item> listOfItems;
    private Item lastItem;
    private double tax;

    public SaleInfoDto(LinkedList listOfItemsint, int totalCost, Date saleTime, Item lastItem)
    {
        this.totalCost = (double)totalCost;
        this.lastItem = lastItem;
        //this.itemInfo = itemInfo;
        this.saleTime = saleTime;
        this.listOfItems = listOfItemsint;
    }

    public LinkedList getItems()
    {
        return listOfItems;
    }


    public void setTax(double tax)
    {
        this.tax = tax;
    }

    // här lagras den slutliga kostnaden och alla item info
    public double getTotalCost ()
    {
        return totalCost;
    }

    public Item getlastItem()
    {
        return lastItem;
    }

    public double getTax()
    {
        return tax;
    }
    public void setTotalCost(double totalCost)
    {
        this.totalCost = totalCost;
    }


}
