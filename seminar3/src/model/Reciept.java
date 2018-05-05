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
        //int len = list.getList().size();
        items = saleInfoDto.getItems();
        //System.out.println("len:"+len);
        //list.getList().add(new Item(1,1,"s"));
//        if(len!=0)
//        {
//            for (int i = 0; i <= len; i++)
//            {
//                kvitto.append(list.getList().get(i).getItemId() + ", ");
//            }
//        }

       for (Item currentItem : items)
       {
            kvitto.append(currentItem.getItemName() + ", Price: " + currentItem.getItemCost() + "\n");
//
//           itemAlredyExist = currentItem.equals(item);
//           System.out.println(itemAlredyExist);
//           if(itemAlredyExist)
//           {
//               lastItem = currentItem;
//               lastItem.increaseItemQuantity();
//               break;
//           }
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
