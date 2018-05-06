package view;


import controller.Controller;
import DTO.SaleInfoDto;
import model.Reciept;
import model.Item;
import dbhandler.CustomerRegister;

import java.util.HashMap;


public class View {
    private Controller contr;
    private Item item;
    private SaleInfoDto saleInfo;
    private CustomerRegister customerRegister;



    public View(Controller contr) {
        this.contr = contr;
    }


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
        int id = 3;
        String customerRegister = contr.checkCustomerId(id);
        printCustomerId(customerRegister);



        //eventuellrabatt förfrågan
        double priceAfterDiscount = contr.requestDscount();
        printNewPriceAfterdiscount(priceAfterDiscount);
        //skapa ett belop från betalning
        int cashPayed = 180;

        //slå in det betalda beloppet
        double change = contr.cashPayment(cashPayed);  // kanske borde så in customerID också  // item bara test så det ska fungera

        // kvitto för betalning skapad med detaljer
    }

    private void printCustomerId(String customerId){
        System.out.println("customerId is found: " + customerId);
   //     System.out.println("Customer register number is fund: " + customerRegister.cusromerInfo());
    }

    private void printInfoDisplay(SaleInfoDto saleInfo)
    {
        System.out.println(saleInfo.getlastItem().getItemName() + " pris: " + saleInfo.getlastItem().getItemCost());
        System.out.println("quantity: " + saleInfo.getlastItem().getItemQuantity());
        System.out.println("Total Price: " + saleInfo.getTotalCost());
        System.out.println();
    }
    private void printNewPriceAfterdiscount(double price)
    {
        System.out.println("new price after discount: " + price);
    }

    private void printInfoDisplayTotal(SaleInfoDto saleInfo)
    {
        System.out.println("Total price to pay: " + saleInfo.getTotalCost());
        System.out.println("Of Which is tax: " + saleInfo.getTax());
        System.out.println();
    }
}

