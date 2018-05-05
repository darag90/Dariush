
package dbhandler;


import model.ItemList;
import model.Printer;
import model.Item;
import dbhandler.InventorySystem;


public class ExternalSystem {
    private Printer printer = new Printer();
    private int Item;
    private AccountingSystem accountingSystem;
    private InventorySystem inventorySystem;
  //  private CustomerRegister customerRegister = new CustomerRegister();


    public ExternalSystem(Printer printer)
    {
        this.printer = printer;
        this.inventorySystem = new InventorySystem();
    }

 /*   public CustomerRegister getCustomerRegister(){
        return CustomerRegister;
    } */

    public Item getItem(int id){
        return inventorySystem.getItem(id);
    }

 /*    public int getItemCost(int cost){
    } */









 /*   public Authorization InformationSystem(int itemCost, String itemList){
        return
    } */


}