package model;

import item.Item;

import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;


public class ItemList {
    private int cost = 0;
    private List<Item> list = new ArrayList<>();

    public ItemList(){
    }

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
     * lagrar item i en lista och uppdaterar kostnaden för hela lista
     */

  /*  public void itemDTO(Item item){
        list.add(item);
        cost += item.getCost();
    } */

    /**
     * tar en lista av valda item och returnerar en sträng som en lista
     */

    public String resultOfItemList (ItemList list) {
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
    }



}
