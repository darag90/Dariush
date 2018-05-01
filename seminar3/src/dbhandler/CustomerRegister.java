package dbhandler;

import dbhandler.DiscountRules;
import dbhandler.ExternalSystem;
import model.Item;
import model.ItemList;
import model.Printer;
import model.PaymentController;

import controller.Controller;


public class CustomerRegister {
    private Printer printer = new Printer();
  //  private DiscountRules discountRules = new DiscountRules();
    private ItemList itemList = new ItemList();
    private Item item = new Item();


    /**
     * skapar rabbat för kunden
     */



    /**
     *  resultatet om kunden har rätt till räbbat eller inte kommer att raporteras
     *  om CustomerID == true då kommer det bli godkänt annars blir det null
     */
    public CustomerRegister getCustomerRegidter(int index, boolean result){
        int customerID = itemList.getList().size() - 1;
        itemList.getList().get(index - 1).equals(result);

        if(customerID == index){
            printResults();
            return null;
        }
        return new CustomerRegister();
    }

    /**
     * skickar en lista över kund id
     */

    private void printResults(){
      //   printer.printReciept();

    }

    /**
     * Om kundens ID finns i registret
     */

 /*   public boolean CustomerID(int discount, int precent){
        int entityForDiscount = DiscountRules.

    } */






}
