package model;

import DTO.SaleInfoDto;

import java.util.Date;
import java.util.LinkedList;
import java.util.*;

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

  /*  public SaleInfo uppdateCost(int itemCost, int totalCost){

        return new
    } */


    // random av valda item
    public String[] randomItem(){
        String[] strings1 = {};
        String[] randomItem = {"milk", "bred", "egg", "chicken", "spaghetti"};
        List<String> list = new ArrayList<>();

        // add item to list
        for (String i: randomItem)
            list.add(i);

        for (int i = 0; i < list.size(); i++){
            System.out.printf(list.get(i));
        }
      return randomItem;
    }

}
