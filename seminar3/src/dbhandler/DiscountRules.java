package dbhandler;

import dbhandler.CustomerRegister;
import model.Item;


public class DiscountRules {
    private CustomerRegister customerRegister;
    private Item item;


    public DiscountRules(/*CustomerRegister customerRegister, Item item*/){
       // this.customerRegister = customerRegister;
       // this.item = item;

    }



    public double DiscountInPrecent(){
        double precent = 0.15;
        double totalCost = item.getItemCost();
        double newPrice = precent*totalCost;
        return  newPrice;
    }




}
