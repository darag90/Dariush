package itemList;

import item.Item;

import java.util.ArrayList;
import java.util.List;
import controller.Controller;


public class ItemList {
    private int cost;
    private List<Item> list = new ArrayList<Item>();

    public ItemList(){
    }

    public List<Item> getList(){
        return list;
    }

    /**
     * returnerar alla kostnader för item i lista
     * @return kostnad
     */
    public int getCost{
        return cost;
    }

    /**
     * lagrar item i en lista och uppdaterar kostnaden för hela lista
     */

    public void itemDTO(Item item){
        list.add(item);
        cost += item.getCost();
    }

    /**
     * tar en lista av valda item och returnerar en sträng som en lista
     */



}
