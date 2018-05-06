package se.kth.iv1201.pos.model;

import se.kth.iv1201.pos.dto.SaleInfoDto;
import java.lang.StringBuilder;
import java.util.LinkedList;

/**
 * Denna klass representerar ett kvitto i försäljningen.
 * @author Dariush Aghadai Ghaderi, darag@kth.se
 * @author Simon Lagerqvist, simlag@kth.se
 * @version 1.0
 * @since 2018-05-06
 */

public class Reciept {
    private StringBuilder kvitto = new StringBuilder();
    private double cost;
    private LinkedList<Item> items;



    /**
     * Skapar en ny kvitto
     * @param saleInfoDto  denna klass inehåller informtion om affären.
     */


   public Reciept(SaleInfoDto saleInfoDto){
        cost = saleInfoDto.getTotalCost();
        items = saleInfoDto.getItems();


       for (Item currentItem : items)
       {
            kvitto.append(currentItem.getItemName() + ", Price: " + currentItem.getItemCost() + "\n");
       }
    }

    public String getSBToString()
    {
        return kvitto.toString();
    }

    /**
     * hämta kostnade från kvittot.
     * @return kostnaden
      */


    public double getCost()
    {
        return cost;
    }

}
