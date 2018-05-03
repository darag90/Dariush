package view;


import controller.Controller;
import DTO.SaleInfoDto;
import model.Reciept;
import model.Item;


public class View {
    private Controller contr;
    private Item item;



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

        //Skapa ett nytt id som egentligen skulle slagits in av kassören
        int itemId = 12345678;
        contr.itemId();

        //lägg till en vara i försälningen
        SaleInfoDto saleInfo = contr.enterItemId(itemId);

        //slutför försälningen
        contr.endSale();

        //exentuell customerId förfrågan
       // boolean id = true;
        contr.checkCustomerId();

        //eventuell rabatt förfrågan
        contr.requestDscount();

        //skapa ett belop från betalning
        int cashPayed = 123;

        //slå in det betalda beloppet
     //   contr.cashPayment(cashPayed, item);  // kanske borde så in customerID också  // item bara test så det ska fungera

        // kvitto för betalning skapad med detaljer





    }
}

