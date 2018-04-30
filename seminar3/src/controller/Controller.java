
package controller;


import dbhandler.ExternalSystem;
import model.Item;
import model.ItemList;
import model.PaymentController;
import DTO.SaleInfoDto;
import model.Sale;
import java.lang.String;


public class Controller {

    private PaymentController paymentController;
    private ExternalSystem externalSystem;
    private Sale sale;
    private Item item;
    private ItemList itemList;



    public Controller(ExternalSystem externalSystem, PaymentController paymentController) {
        this.paymentController = paymentController;
        this.externalSystem = externalSystem;
        //this.itemList = itemList;
        //this.item = item;

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


    /* public Payment enterPayment(int cashAmount){

    } */


  /*  public int getCost(int Id){
        int cost = item.getItemCost(Id);
        return cost;
    } */


    public int cashPayment(int cashAmount)
    {
        //ItemList list =
        //int cost = item.getItemCost();
        int change = 1;//paymentController.cashPayment(cashAmount, cost,);     // måste fixa cashAmount, klagar på int
        return change;
    }








}

