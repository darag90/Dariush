package se.kth.iv1201.pos.dbhandler;

import se.kth.iv1201.pos.dto.SaleInfoDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 * accounting system lagrar hela affären i en list, egentligen borde den skicka information om affären
 * till det extärna accoutingsystemet med då inget sådant finns lagras det här istället.
 */
public class AccountingSystem
{

    private List<SaleAccountingInformation> fisishedSales;
    public AccountingSystem()
    {
        fisishedSales = new ArrayList<>();
    }

    public void sendToAccntingSystem(SaleInfoDto saleInfoDto)
    {
        fisishedSales.add(new SaleAccountingInformation(saleInfoDto.getTotalCost(),saleInfoDto.getSaleTime()));
    }

    private class SaleAccountingInformation
    {
        private double amountPayed;
        private Date dateOfSale;

        private SaleAccountingInformation(double amountPayed, Date dateOfSale)
        {
            this.amountPayed = amountPayed;
            this.dateOfSale = dateOfSale;
        }
    }
}


