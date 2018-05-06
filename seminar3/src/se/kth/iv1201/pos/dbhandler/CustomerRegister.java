package se.kth.iv1201.pos.dbhandler;

import se.kth.iv1201.pos.model.Printer;
import se.kth.iv1201.pos.model.PaymentController;


import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;


public class CustomerRegister {
    private Printer printer = new Printer();
    private DiscountRules discountRules;
    private ExternalSystem externalSystem = new ExternalSystem(printer);
    private PaymentController paymentController = new PaymentController(printer);



   /**
     * kontrollerar om kundens Id finns tillgänglig
     */

/*   public boolean getinInfoOfcustomerId(){
       boolean customerId = false;
       ArrayList availableCustomerId = setCustomerList();
       ArrayList customerName = customerList();
       for (ArrayList pos = 1; pos <= 5; pos++)   // finns problem i denna rad !!
       if(customerName[pos] == availableCustomerId)
       {
           customerId = true;
           break;
       }
       return customerId;
   }

    /**
     * en lista över ett antal customer som är registerad som medlem i store
     */

     public String getInfoOfCustomerId(int id){
         HashMap availableCustomerId = cusromerInfo();
         if (availableCustomerId.get(id)==null)
            // return "false";
             return "false";
         else
            return (String)availableCustomerId.get(id);

     }



    public HashMap cusromerInfo(){

        HashMap<Integer, String> customers = new HashMap<>();
        customers.put(1, "Simon Lagerqvist");
        customers.put(2, "Dariush Ghaderi");
        customers.put(3, "Ali Qurbani");
        customers.put(4, "Bengt karlson");
        customers.put(5, "David Ingarson");
        return customers;
    }

}
