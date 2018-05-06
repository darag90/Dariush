package se.kth.iv1201.pos.dbhandler;

import se.kth.iv1201.pos.dto.SaleInfoDto;

/**
 * Denna klass har ansvar för rabbaten
 * @author Dariush Aghadai Ghaderi, darag@kth.se
 * @author Simon Lagerqvist, simlag@kth.se
 * @version 1.4
 * @since 2018-05-06
 */


public class DiscountRules {
    private SaleInfoDto saleInfoDto;

    /**
     * Skapar en ny instans
     * @param saleInfoDto här kommer info om sale
     */

    public DiscountRules(SaleInfoDto saleInfoDto){
        this.saleInfoDto = saleInfoDto;

    }

    /**
     * Denna metod tar hand om rabaten
     * där den totala kostnaden som blir rabbat på 15 procent
     * @return
     */

    public double DiscountInPrecent(){
        double precent = 0.85;
        double totalCost = saleInfoDto.getTotalCost();
        double newPrice = (precent * totalCost);
        saleInfoDto.setTotalCost(newPrice);
        return  newPrice;
    }
}
