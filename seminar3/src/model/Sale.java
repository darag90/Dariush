package model;

import DTO.SaleInfoDto;


import java.util.Date;
import java.util.LinkedList;
import java.util.*;

public class Sale
{
    private Date saleTime;
    private int cost;
    private Item item = new Item();
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
            System.out.printf("%S ", list.get(i));
        }
      return strings1;
    }



  /*  public int getCost(Item item){
        ItemList list = getItemList(item);
        return list.getCost();
    }


    public ItemList getItemList(Item item1){
        ArrayList<Item> list = new ArrayList<>();
        ItemList itemList = new ItemList();
        list.add(item1);
        cost += item.getItemCost();
        return itemList;
    }  */

}
