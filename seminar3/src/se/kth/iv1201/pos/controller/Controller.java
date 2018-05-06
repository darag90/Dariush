
package se.kth.iv1201.pos.controller;


import se.kth.iv1201.pos.dbhandler.DiscountRules;
import se.kth.iv1201.pos.dbhandler.ExternalSystem;
import model.*;
import se.kth.iv1201.pos.dto.SaleInfoDto;
import se.kth.iv1201.pos.dbhandler.CustomerRegister;

import se.kth.iv1201.pos.model.Item;
import se.kth.iv1201.pos.model.PaymentController;
import se.kth.iv1201.pos.model.Sale;

public class Controller {

    private PaymentController paymentController;
    private ExternalSystem externalSystem;
    private Sale sale;
    private Item item;
    //private ItemList itemList = new ItemList();
    private CustomerRegister customerRegister;
    private DiscountRules discountRules;



    public Controller(ExternalSystem externalSystem, PaymentController paymentController)
    {
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


    /**
     * Metoden för för betalning med kontanter och retur lämnas
     * @param cashAmount mängden kontanter som kunden ger
     * @param item1 item som är till försäljning av den vara/varor kunden tar
     * @return kostnaden för hela köpet
     */

    public double cashPayment(int cashAmount)
    {
        double change = paymentController.cashPayment(cashAmount, sale.getSale());     // måste fixa cashAmount, klagar på int
        return change;
    }








}

