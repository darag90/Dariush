package se.kth.iv1201.pos.model;
/**
 * Denna klass har upgiften att hantera utskriften av kvittot.
 * @author Dariush Aghadai Ghaderi, darag@kth.se
 * @author Simon Lagerqvist, simlag@kth.se
 * @version 1.0
 * @since 2018-05-06
 */
public class Printer {

    /** konstruktor för printer.*/
    public Printer(){

    }

    /**
     * Skriver ut själv kvittot.
     * @param reciept ett object av typen <code>recipe</code> inehållandes all information som skall finnas på kvittot.
     */
    void printReciept (Reciept reciept){
        String stringprint = reciept.getSBToString();
        double cost = reciept.getCost();

        System.out.println("---------------Kvitto---------------");
        System.out.println("Item Id: " + stringprint);
        System.out.println("Total cost:" + cost);
        System.out.println("Välkommen åter");
        System.out.println("------------------------------------");
    }
}
