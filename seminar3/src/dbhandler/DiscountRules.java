package dbhandler;

import DTO.SaleInfoDto;
import dbhandler.CustomerRegister;
import model.Item;
import model.Sale;

import java.util.List;


public class DiscountRules {
    private CustomerRegister customerRegister;
    private SaleInfoDto saleInfoDto;


    public DiscountRules(SaleInfoDto saleInfoDto){
       // this.customerRegister = customerRegister;
       // this.item = item;
        this.saleInfoDto = saleInfoDto;

    }



    public double DiscountInPrecent(){
        double precent = 0.85;
        double totalCost = saleInfoDto.getTotalCost();
        double newPrice = (precent * totalCost);
        return  newPrice;
    }


}
