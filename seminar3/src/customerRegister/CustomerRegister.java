package customerRegister;

import discountRules.DiscountRules;
import externalSystem.ExternalSystem;
import itemList.ItemList;
import printer.Printer;

import controller.Controller;


public class CustomerRegister {
    private Printer printer = new Printer();
    private DiscountRules discountRules = new DiscountRules();
    private ItemList itemList = new ItemList();
    private ExternalSystem externalSystem = new ExternalSystem(printer);
    private Controller controller = new Controller(externalSystem);

    /**
     * skapar rabbat för kunden
     */



    /**
     *  resultatet om kunden har rätt till räbbat eller inte kommer att raporteras
     *  om CustomerID == true då kommer det bli godkänt annars blir det null
     */
    public CustomerRegister (int index, boolean result){
        int customerID = itemList.getList().size() - 1;
        itemList.getList().get(index - 1).equals(result);

        if(customerID == index){
            printResults();
            return null;
        }
    }

    /**
     * skickar en lista över kund id
     */

    private void printResults(){
        printer.printReciept();

    }

    /**
     *
     */

    private void discount(){

    }



}
