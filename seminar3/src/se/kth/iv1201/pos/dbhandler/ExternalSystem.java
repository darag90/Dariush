
package se.kth.iv1201.pos.dbhandler;



import se.kth.iv1201.pos.model.Printer;
import se.kth.iv1201.pos.model.Item;

/**
 * Denna klass ansvarar för item i inventory
 * @author Dariush Aghadai Ghaderi, darag@kth.se
 * @author Simon Lagerqvist, simlag@kth.se
 * @version 1.0
 * @since 2018-05-06
 */

public class ExternalSystem {
    private Printer printer;
    private InventorySystem inventorySystem;

    /**
     * Skapar en ny instans
     * @param printer
     */

    public ExternalSystem(Printer printer)
    {
        this.printer = printer;
        this.inventorySystem = new InventorySystem();
    }

    /**
     * Denna metod tar items id
     * @param id id för items
     * @return reurnerar det bestämda item id
     */

    public Item getItem(int id){
        return inventorySystem.getItem(id);
    }











 /*   public Authorization InformationSystem(int itemCost, String itemList){
        return
    } */


}