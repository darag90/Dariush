package se.kth.iv1201.pos.dbhandler;

import se.kth.iv1201.pos.dto.SaleInfoDto;


public class DiscountRules {
    private CustomerRegister customerRegister;
    private SaleInfoDto saleInfoDto;


    public DiscountRules(SaleInfoDto saleInfoDto){
        this.saleInfoDto = saleInfoDto;

    }



    public double DiscountInPrecent(){
        double precent = 0.85;
        double totalCost = saleInfoDto.getTotalCost();
        double newPrice = (precent * totalCost);
        saleInfoDto.setTotalCost(newPrice);
        return  newPrice;
    }
    

}
