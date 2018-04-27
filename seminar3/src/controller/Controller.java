
package controller;


import dbhandler.ExternalSystem;
import model.PaymentController;
import DTO.SaleInfoDto;


public class Controller {

    private PaymentController paymentController;
    private ExternalSystem externalSystem;


    public Controller(ExternalSystem externalSystem, PaymentController paymentController) {
        this.paymentController = paymentController;
        this.externalSystem = externalSystem;
    }

    public void startSale()
    {
    }

    public SaleInfoDto enterItemId(int id)
    {
        SaleInfoDto saleInfoDto = new SaleInfoDto();
        return saleInfoDto;
    }

    public void endSale()
    {
    }

    public void requestDscount()
    {
    }



    /*   public int getCost(int itemCost){
        int cost = getCost(itemCost);
        return cost;
    } */

    public void cashPayment(int cashAmount){
        //cashPayment change = new model.PaymentController();




    }








    }

