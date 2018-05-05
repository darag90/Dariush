package view;


import controller.Controller;
import DTO.SaleInfoDto;
import model.Reciept;
import model.Item;


public class View {
    private Controller contr;
    private Item item;
    private SaleInfoDto saleInfo;



    public View(Controller contr) {
        this.contr = contr;
    }

  /*  public void Item(){
        Item item= new Item();
    } */

    public void sampleExecution() {
        /*Denna metod simulerar ett exempel på en försäljning*/

        //Starta försäljningen
        contr.startSale();

        //Skapa tre st nya id:n som egentligen skulle slagits in av kassören
        int itemIdGurka = 1234;
        int itemIdBanan = 5678;
        int itemIdTandkräm = 1357;
        contr.itemId();

        //lägg till tre varor i försälningen
        saleInfo = contr.enterItemId(itemIdGurka);
        printInfoDisplay(saleInfo);
        saleInfo = contr.enterItemId(itemIdBanan);
        printInfoDisplay(saleInfo);
        saleInfo = contr.enterItemId(itemIdGurka);
        printInfoDisplay(saleInfo);
        saleInfo = contr.enterItemId(itemIdTandkräm);
        printInfoDisplay(saleInfo);


        //slutför försäljningen
        SaleInfoDto saleInfoRegistrationDone = contr.endSale();
        printInfoDisplayTotal(saleInfoRegistrationDone);

        //exentuell customerId förfrågan
        contr.checkCustomerId();

        //eventuell rabatt förfrågan
        contr.requestDscount();

        //skapa ett belop från betalning
        int cashPayed = 180;

        //slå in det betalda beloppet
        double change = contr.cashPayment(cashPayed);  // kanske borde så in customerID också  // item bara test så det ska fungera

        // kvitto för betalning skapad med detaljer
    }

    private void printInfoDisplay(SaleInfoDto saleInfo)
    {
        System.out.println(saleInfo.getlastItem().getItemName() + " pris: " + saleInfo.getlastItem().getItemCost());
        System.out.println("quantity: " + saleInfo.getlastItem().getItemQuantity());
        System.out.println("Total Price: " + saleInfo.getTotalCost());
        System.out.println();
    }

    private void printInfoDisplayTotal(SaleInfoDto saleInfo)
    {
        System.out.println("Total price to pay: " + saleInfo.getTotalCost());
        System.out.println("Of Which is tax: " + saleInfo.getTax());
        System.out.println();
    }
}

