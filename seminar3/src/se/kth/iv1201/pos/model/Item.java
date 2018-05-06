package se.kth.iv1201.pos.model;
/**
 *
 */

import java.util.ArrayList;
import java.util.List;


/**
 *  Represents a item that can be registred in a sale.
 *  @author Dariush Aghadai Ghaderi, darag@kth.se
 *  @author Simon Lagerqvist, simlag@kth.se
 *  @version 1.8
 *  @since 2018-05-06
 */
public class Item {

    /**id number for the item*/
    private int idNumber;//streckkod
    /**this represtns the name of an item*/
    private String itemName;//namn
    private int itemQuantity;
    private int itemCost;

    /**
     *This construcor creates a new <code>Item</code>. The id, cost/price and name of item should be specified.
     * @param id the item identifier.
     * @param itemCost the cost of the item.
     * @param itemName the name of the item.
     */

    public Item(int id, int itemCost, String itemName){
        this.itemCost = itemCost;
        this.idNumber = id;
        this.itemName = itemName;
    }

    /**
     * hämtar id:t för item
     * @return id för varan
     */

    public int getItemId(){
        return idNumber;
    }

    /**
     * hämtar mängden av den varan som finns
     * @return hur många gåner varan blivit registrerad.
     */
    public int getItemQuantity(){
        return itemQuantity;
    }

    /**
     * ökar <code>itemQuantuty</code> med <code>1</code>
     */
    public void increaseItemQuantity(){
       this.itemQuantity += 1;
    }
    /** hämtar namnet på varan*/
    public String getItemName(){
        return itemName;
    }

    /**hämtar priset på vararn*/
    public int getItemCost(){
        return itemCost;
    }

    /**
     * jämför item med ett annat item för att se om de är samma.
     * @param object det item man vill jämföra med.
     * @return boolean returnerar true om det var man jämför med var samma, annars returneras false.
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

        return this.itemName == item.getItemName();
    }

}
