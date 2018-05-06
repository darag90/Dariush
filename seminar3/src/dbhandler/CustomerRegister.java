package dbhandler;

import dbhandler.ExternalSystem;
import model.Printer;
import model.PaymentController;


import java.lang.String;
import java.util.ArrayList;
import java.util.List;


public class CustomerRegister {
    private Printer printer = new Printer();
    private DiscountRules discountRules;
    private ExternalSystem externalSystem = new ExternalSystem(printer);
    private PaymentController paymentController = new PaymentController(printer);



   /**
     * kontrollerar om kundens Id finns tillgänglig
     */

   public boolean getinInfoOfcustomerId(){
       boolean customerId = false;
       int availableCustomerId = setCustomerList();
       int customerName = customerList();
       for (int pos = 1; pos <= customerName; pos++)   // finns problem i denna rad !!
       if(customerName == availableCustomerId)
       {
           customerId = true;
           break;
       }
       return customerId;
   }

    /**
     * en lista över ett antal customer som är registerad som medlem i store
     */

    public int setCustomerList()
    {
        int custom = 1;
        ArrayList<Integer> customerList = new ArrayList<>();
        customerList.add(1);
        customerList.add(2);
        customerList.add(3);
        customerList.add(4);
        customerList.add(5);

        System.out.println(customerList);

        return custom;
    }


    // lista över ett vald antal kunder
    public int customerList(){
        int newCustomer = 1;
        String customer1 = "Simon Lagerqvist";
        String customer2 = "Dariush Ghaderi";
        String customer3 = "Leif Lindbäck";
        String customer4 = "Bengt Molin";
        String customer5 = "Mester Miao ";


        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
        System.out.println(customer4);
        System.out.println(customer5);

        return newCustomer;

    }
}
