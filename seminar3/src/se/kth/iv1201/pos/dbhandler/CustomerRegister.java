package se.kth.iv1201.pos.dbhandler;


import java.lang.String;
import java.util.HashMap;

/**
 * Denna klass har ansvar för att kontrollera kundens id
 * I denna klass finns också kunderna namne reggat
 * @author Dariush Aghadai Ghaderi, darag@kth.se
 * @author Simon Lagerqvist, simlag@kth.se
 * @version 1.0
 * @since 2018-05-06
 */

public class CustomerRegister {


    /**
     * Metoden används för att kontrollerna om kundens id finns i systemt
     * @param id det används för att slå in kundens id
     * @return returnnerar om kund finns registerad eller inte
     */

     public String getInfoOfCustomerId(int id){
         HashMap availableCustomerId = cusromerInfo();
         if (availableCustomerId.get(id)==null)
             return "false";
         else
            return (String)availableCustomerId.get(id);
     }

    /**
     * Här lagras kundens namne och dess id nummer
     * @return här returneras customers info
     */

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
