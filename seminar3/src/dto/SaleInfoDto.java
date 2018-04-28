package DTO;

public class SaleInfoDto
{
    private int totalCost;
    private String itemInfo;

    public SaleInfoDto()
    {

    }

    // här lagras den slutliga kostnaden och alla item info
    public void SaleInfo (int totalCost, String itemInfo){
        this.totalCost = totalCost;
        this.itemInfo = itemInfo;
    }


}
