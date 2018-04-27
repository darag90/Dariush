package view;


import controller.Controller;
import model.Item;
import model.PaymentController;
import java.lang.StringBuilder;
import DTO.SaleInfoDto;


public class View {
    private Controller contr;



    public View(Controller contr) {
        this.contr = contr;
    }

    public void sampleExecution() {
        /*Denna metod simulerar ett exempel på en försäljning*/

        //Starta försäljningen
        contr.startSale();

        //Skapa ett nytt id som egentligen skulle slagits in av kassören
        int itemId = 12345678;

        //lägg till en vara i försälningen
        SaleInfoDto saleInfo = contr.enterItemId(itemId);

        //slutför försälningen
        contr.endSale();

        //eventuell rabatt förfrågan
        contr.requestDscount();

        //skapa ett belop från betalning
        int cashPayed = 123;

        //slå in det betalda beloppet
        contr.cashPayment(cashPayed);

    }
}

