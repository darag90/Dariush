
package controller;


import dbhandler.DiscountRules;
import dbhandler.ExternalSystem;
import model.*;
import DTO.SaleInfoDto;
import dbhandler.CustomerRegister;
import java.lang.String;
import model.Sale;

public class Controller {

    private PaymentController paymentController;
    private ExternalSystem externalSystem;
    private Sale sale;
    private Item item;
    private ItemList itemList = new ItemList();
 //   private ItemList itemList;
    private CustomerRegister customerRegister;
    private DiscountRules discountRules;



    public Controller(ExternalSystem externalSystem, PaymentController paymentController) {
        this.paymentController = paymentController;
        this.externalSystem = externalSystem;

    }

    public void startSale()
    {
        this.sale = new Sale();
    }

    public SaleInfoDto enterItemId(int id)
    {
        Item item = externalSystem.getItem(id);
        if(item != null)
        {
            sale.addItem(item);
        }
        return sale.getSale();
    }



    public SaleInfoDto endSale()
    {
        return sale.finishRegistration();
    }


    // lagrar customerId
    public void checkCustomerId(int id)
    {
        this.customerRegister = new CustomerRegister();
        customerRegister.getinInfoOfcustomerId();
    }


    public double requestDscount()
    {
        this.discountRules = new DiscountRules(sale.getSale());
        return discountRules.DiscountInPrecent();
    }

    public void itemId(){
        System.out.println("HEJ");
        this.item = new Item(11,11, "j");
    }


    /* public Payment enterPayment(int cashAmount){

    } */


   /* public int getCost(int Id){
        int cost = item.getItemCost(Id);
        return cost;
    } */


    /**
     * Metoden för för betalning med kontanter och retur lämnas
     * @param cashAmount mängden kontanter som kunden ger
     * @param item1 item som är till försäljning av den vara/varor kunden tar
     * @return kostnaden för hela köpet
     */

    public double cashPayment(int cashAmount)
    {
      //  this.paymentController = new PaymentController();
     //   this.itemList = new ItemList();
     //   this.item = new Item();

        //String[] list1 = sale.randomItem();
        //ItemList list = itemList.getItemList(item1);
        //int list = sale.getCost(item1);
    //    ItemList itemList = sale.getItemList(item1);
        //int cost = item.getItemCost();

        double change = paymentController.cashPayment(cashAmount, sale.getSale());     // måste fixa cashAmount, klagar på int
      //  System.out.println();
        return change;
    }








}

