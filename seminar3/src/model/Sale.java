package model;

import dto.SaleInfoDto;

import java.util.Date;
import java.util.LinkedList;

public class Sale
{
    private Date saleTime;
    private LinkedList<Item> listOfItems = new LinkedList<Item>();

    public Sale()
    {
        this.saleTime = new Date();
    }

    public SaleInfoDto getSale()
    {
        return new SaleInfoDto();
    }

    public void addItem(Item item)
    {
        this.listOfItems.add(item);
    }

}
