
package controller;


import dbhandler.ExternalSystem;
import model.Item;
import model.PaymentController;
import DTO.SaleInfoDto;
import model.Sale;


public class Controller {

    private PaymentController paymentController;
    private ExternalSystem externalSystem;
    private Sale sale;


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
        sale.addItem(item);
        SaleInfoDto saleInfoDto = new SaleInfoDto();

        return saleInfoDto;
    }

    public void endSale()
    {
    }

    public void requestDscount()
    {
    }


 /*   public Payment enterPayment(int cashAmount){


    }

    /*   public int getCost(int itemCost){
        int cost = getCost(itemCost);
        return cost;
    } */


    public int cashPayment(int cashAmount){

    //    int change = paymentController.cashPayment(cashAmount);     // måste fixa cashAmount, klagar på int
    //    return change;



    }








    }

