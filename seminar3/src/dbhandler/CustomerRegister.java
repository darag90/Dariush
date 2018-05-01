package dbhandler;

import dbhandler.DiscountRules;
import dbhandler.ExternalSystem;
import model.ItemList;
import model.Printer;
import model.PaymentController;

import controller.Controller;

import java.util.ArrayList;
import java.util.List;


public class CustomerRegister {
    private Printer printer = new Printer();
    private DiscountRules discountRules = new DiscountRules();
    private ItemList itemList = new ItemList();
    private ExternalSystem externalSystem = new ExternalSystem(printer);
    private PaymentController paymentController = new PaymentController(printer);
    //private Controller controller = new Controller(externalSystem, paymentController);


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
            printResults();                                     // kanske inte behövs
            return null;
        }
        return new CustomerRegister();
    }

    /**
     * en lista över ett antal customer som är registerad som medlem i store
     */

    public void setCustomerList()
    {
        ArrayList<Integer> customerList = new ArrayList<>(5);
        customerList.add(1);
        customerList.add(2);
        customerList.add(3);
        customerList.add(4);
        customerList.add(5);

        System.out.println(customerList);
    }

 /*   public CustomerRegister()
    {
       // boolean customerList = (5 <= 1);
      //  int customerList = 5;
        boolean customerList = (5 <= 1);
        boolean availableCustomerId = customerList.


    } */









    private void printResults(){
       // printer.printReciept();
      //  CustomerRegister customerRegister = new {CustomerRegister (Anders)};

    }

    /**
     * Om kundens ID finns i registret
     */

 /*   public boolean CustomerID(int discount, int precent){
        int entityForDiscount = DiscountRules.

    }  */



}
