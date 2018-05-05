package model;


import dbhandler.ExternalSystem;
import model.Item;


import java.util.ArrayList;
import java.util.List;
import java.util.*;



public class ItemList {
    private Item item = new Item(1,1,"f");
    private int cost = 0;
    private List<Item> list = new ArrayList<>();

    public ItemList(){

    }


    // felet ligger här
    public List<Item> getList(){
      return list;
    }


    /**
     * returnerar alla kostnader för item i lista
     * @return kostnad
     */
    public int getCost(){
        return cost;
    }



    /**
     * metoden lägger ihopp alla item som i en lista och sedan räcker den kostnaden för
     * hela köpet
     * @param item1 det väljs vilken item, sedan läggs dem ihop
     * @return här returneras alla varor som blivit vald
     */

    public ItemList getItemList (Item item1){
        ItemList itemList = new ItemList();
        list.add(item1);
        cost += item.getItemCost();
        return itemList;

    }

    /**
     * tar en lista av valda item och returnerar en sträng som en lista
     */

/*    public String resultOfItemList (ItemList list) {
        StringBuilder sb = new StringBuilder();
        int len = list.getList().size();
        for (int i = 0; i < len; i++) {
            sb.append("item list");
            sb.append(list.getList().get(i).getItemId());
            if (list.getList().get(i).equals(list)) {               // osäker
                sb.append("Result: available itemId" + " ");
                sb.append("\n");
            }
            else {
                sb.append("Result: itemId not available" + " ");
                sb.append("\n");
            }

        }
        return sb.toString();
    }  */



}
