package se.kth.iv1201.pos.dbhandler;


import se.kth.iv1201.pos.model.Sale;

public interface Observer
{
    /**
     * det kommer att kalla på sale när en försäljning sker
     * @param sale när en försäljning genomförs
     */
    void notify(Sale sale);
}
