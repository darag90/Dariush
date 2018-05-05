package model;

import DTO.SaleInfoDto;

import java.util.Date;
import java.util.LinkedList;
import java.util.*;

public class Sale
{
    private final Date saleTime;
    private LinkedList<Item> listOfItems = new LinkedList<Item>();
    private int totalCost;
    private Item lastItem;
    private Item item = new Item();

    public Sale()
    {
        this.saleTime = new Date();
    }

    public SaleInfoDto getSale()
    {
        //skapar en kopia för att få bra inkapsling
        return new SaleInfoDto((LinkedList<Item>) listOfItems.clone(),totalCost,saleTime,lastItem);
    }

    public void addItem(Item item)
    {
        this.lastItem = item;
        boolean itemAlredyExist = false;
        for (Item currentItem : listOfItems)
        {
            itemAlredyExist = currentItem.equals(item);
            System.out.println(itemAlredyExist);
            if(itemAlredyExist)
            {
                lastItem = currentItem;
                lastItem.increaseItemQuantity();
                break;
            }
        }


        if (!itemAlredyExist)
        {
            item.increaseItemQuantity();
            this.listOfItems.add(item);
        }
        calulateTotalCost();

    }

    private void calulateTotalCost()
    {
            totalCost += lastItem.getItemCost();//* listOfItems.get(0).getItemQuantity();//itemQuantity * Price
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
            System.out.printf("%S ", list.get(i));
        }
      return strings1;
    }

}
