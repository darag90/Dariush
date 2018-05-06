package se.kth.iv1201.pos.model;

// import Controller;


import se.kth.iv1201.pos.dto.SaleInfoDto;

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

    public double cashPayment(int cashAmount, SaleInfoDto saleInfoDto){
        Reciept reciept = new Reciept(saleInfoDto);
        printer.printReciept(reciept);

        double change = cashAmount - saleInfoDto.getTotalCost();
        System.out.println("Change: " + change);    //(debugg?)
        return change;
    }



}
