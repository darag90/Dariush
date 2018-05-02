package model;

// import controller.Controller;



public class PaymentController {
    private Printer printer;


    /**
     * skapar en kvitto
     * @param printer för kostnad, item, osv
     */

    public PaymentController(Printer printer){
        this.printer = printer;

    }

    /**
     * Denna metod används för kostnaden av betaling av varor och skickar tillbaka pengar till kunden om det
     * skulle vara något växel kvar. Metoden skickar en lista av valda item för köp.
     * @param cashAmount mängen kontanter som kunden ska betala
     * @param itemCost kostnaden för hela köpet
     * @param list lista av valda item
     * @return skickar tillbaka pengar till kunden om det skulle finnas växel kvar
     */

    public int cashPayment(int cashAmount, int itemCost, ItemList list){
        Reciept reciept = new Reciept(itemCost, list);
        printer.printReciept(reciept);

        int change = cashAmount - itemCost;
        System.out.println("Change" + change);    //(debugg?)
        return change;
    }



}
