package se.kth.iv1201.pos.model;


import se.kth.iv1201.pos.dto.SaleInfoDto;

public interface Observer
{
    /**
     * det kommer att kalla på sale när en försäljning sker
     * @param sale när en försäljning genomförs
     */
    void notify(int totalCost);
}
