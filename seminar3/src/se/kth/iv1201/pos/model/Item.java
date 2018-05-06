package se.kth.iv1201.pos.model;


import java.util.ArrayList;
import java.util.List;

public class Item {
    /*bör inte denna klass represnetera en vara då den heter item?*/
    private int idNumber;//streckkod
    private String itemName;//namn
    private int itemQuantity;
    private int itemCost;

    public Item(int id, int itemCost, String itemName){
        this.itemCost = itemCost;
        this.idNumber = id;
        this.itemName = itemName;
    }


    public int getItemId(){
        return idNumber;
    }

    public int getItemQuantity(){
        return itemQuantity;
    }
    public void increaseItemQuantity(){
       this.itemQuantity += 1;
    }
    public String getItemName(){
        return itemName;
    }

    public int getItemCost(){
        return itemCost;
    }

    /**
     * jämför om två item av samma id finns
     * @param object Item tittar om den önskade item finns
     * @return boolean sant om lika falsk om inte
     */

    public boolean equals(Object object){
        if (object == null){
            return false;
        }
        Item item = (Item)object;

        if(!(this.itemCost == item.getItemCost())){
            return false;
        }

        else if(!(this.idNumber == item.getItemId())){
            return false;
        }

        return this.itemQuantity == item.getItemQuantity();
    }

    /*@todo borde kanske flyttas till sale*/
    public static class ItemList {
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

    }
}
