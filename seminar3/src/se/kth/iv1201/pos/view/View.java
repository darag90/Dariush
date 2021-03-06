
package se.kth.iv1201.pos.view;

import com.sun.jmx.snmp.EnumRowStatus;
import se.kth.iv1201.pos.controller.Controller;
import se.kth.iv1201.pos.controller.OperationFailedException;
import se.kth.iv1201.pos.dbhandler.DatabaseErrorException;
import se.kth.iv1201.pos.dbhandler.InvalidItemException;
import se.kth.iv1201.pos.dbhandler.InventorySystem;
import se.kth.iv1201.pos.dto.SaleInfoDto;
import se.kth.iv1201.pos.model.Item;

/**
 *  Denna klass representerar view där det har med kassören att göra
 *  @author Dariush Aghadai Ghaderi, darag@kth.se
 *  @author Simon Lagerqvist, simlag@kth.se
 *  @version 1.9
 *  @since 2018-05-06
 */

public class View {
    private Controller contr;
    private Item item;
    private SaleInfoDto saleInfo;
    private InventorySystem inventorySystem;
    private ErrorMessageHandler errorMessageHandler;
    private LogHandler logHandler;


    /**
     * Skapar en ny instans
     * @param contr används för opperationer
     */
    public View(Controller contr, ErrorMessageHandler errorMsg, LogHandler logHandler) {
        this.contr = contr;
        this.errorMessageHandler = errorMsg;
        this.logHandler = logHandler;
    }

    /**
     * Denna metod simulerar ett exempel på en försäljning igentligen borde ett riktigt gui finnas här.
     * med enkla ord, detta utför prov
     */
    public void sampleExecution(TotalRevenueView totalRevenueView)
    {

        //Starta försäljningen
        contr.startSale();

        //lägg till displayen som en observatör
        contr.addRentalObserver(totalRevenueView);


        //lägg till tre varor i försälningen

        /*Skapa tre st nya id:n som egentligen skulle slagits in av kassören
        * itemIdGurka = 1234;
        * itemIdBanan = 5678;
        * itemIdTandkräm = 1357;
        * itemGodis = 0000;// denna är en item som inte har sitt id registerad
        * itemThatCousesDataBaseException = 2222;// en vara som åstakommer ett database exception
        * */

        int[] items ={1234,5678,1357,0000,2222};

        for(int item : items) {
            try {
                saleInfo = contr.enterItemId(item);
                printInfoDisplay(saleInfo);
            }
            catch (InvalidItemException invalItem) {
                errorMessageHandler.showErrorMsg("The item registred was not found in the inventory system!");
            }
            catch (OperationFailedException opFail) {
                errorMessageHandler.showErrorMsg("item registraiton failed. Please try agin!\n" +
                        " If the problem is not resolved contact the system administrator!");
                logHandler.logException(opFail);
            }
        }
        
        //slutför försäljningen
        SaleInfoDto saleInfoRegistrationDone = contr.endSale();
        printInfoDisplayTotal(saleInfoRegistrationDone);

        //exentuell customerId förfrågan
        int id = 2;
        String customerRegister = contr.checkCustomerId(id);
        printCustomerId(customerRegister);


        //eventuellrabatt förfrågan
        double priceAfterDiscount = contr.requestDscount();
        printNewPriceAfterdiscount(priceAfterDiscount);
        //skapa ett belop från betalning
        int cashPayed = 180;

        //slå in det betalda beloppet
        double change = contr.cashPayment(cashPayed);

    }

    /**
     * Metoden visar kundens namne och anger om kunden är registerad eller inte
     * @param customerId kundens namne presenteras
     */
    private void printCustomerId(String customerId){
        System.out.println("customerId is found: " + customerId);
    }

    /**
     * Metoden visar ut item, mängden, och den totala pricet
     * @param saleInfo info om försäljningen
     */

    private void printInfoDisplay(SaleInfoDto saleInfo)
    {
        System.out.println(saleInfo.getlastItem().getItemName() + " pris: " + saleInfo.getlastItem().getItemCost());
        System.out.println("quantity: " + saleInfo.getlastItem().getItemQuantity());
        System.out.println("Total Price: " + saleInfo.getTotalCost());
        System.out.println();
    }
    /**
     * Metoden visar den nysa priset efter rabbat
     * @param price nya priset
     */
    private void printNewPriceAfterdiscount(double price)
    {
        System.out.println("new price after discount: " + price);
    }

    /**
     * Metoden visar den totala priset som måste betalas och även skatten
     * @param saleInfo info om
     */
    private void printInfoDisplayTotal(SaleInfoDto saleInfo)
    {
        System.out.println("Total price to pay: " + saleInfo.getTotalCost());
        System.out.println("Of Which is tax: " + saleInfo.getTax());
        System.out.println();
    }

    /*Observera att kvittot skrivs ut av printer*/
}

