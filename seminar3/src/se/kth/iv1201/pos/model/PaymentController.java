package se.kth.iv1201.pos.model;

import se.kth.iv1201.pos.dto.SaleInfoDto;

/**
 * Denna klass hanterar betalningen och relaterade arbetsuppgifter så som att skriva ut ett kvitto.
 * @author Dariush Aghadai Ghaderi, darag@kth.se
 * @author Simon Lagerqvist, simlag@kth.se
 * @version 1.2
 * @since 2018-05-06
 */
public class PaymentController {
    private Printer printer;


    /**
     * konstruktorn för payment kontroller, lagrar en referns till <code>Printer</code>.
     * @param printer för kostnad, item, osv
     */

    public PaymentController(Printer printer){
        this.printer = printer;

    }

    /**
     * Denna metod används för kostnaden av betaling av varor och skickar tillbaka pengar till kunden om det
     * skulle vara något växel kvar. Metoden skickar en lista av valda item för köp.
     * @param cashAmount mängen kontanter som kunden ska betala.
     * @param saleInfoDto information om försäljningen.
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
