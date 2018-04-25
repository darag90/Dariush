package item;

import itemList.ItemList;

public class Item {
    private String itemId;
    private String itemQuantity;
    private int itemCost;
    private boolean result = false;


    public Item(int itemCost, String itemId, String itemQuantity){
        this.itemCost = itemCost;
        this.itemId = itemId;
        this.itemQuantity = itemQuantity;
    }

    /**
     * ställer in resultatet om det finns flera item av samma Id
     */
    public void QuantityItem(boolean result){
         this.result = result;
    }

    public String getItemId(){
        return itemId;
    }

    public String getItemQuantity(){
        return itemQuantity;
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

        if(!(this.itemId == item.getItemId())){
            return false;
        }

        if (!(this.itemQuantity == item.getItemQuantity())){
            return false;
        }

        return true;
    }
}
