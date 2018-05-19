package se.kth.iv1201.pos.view;

import se.kth.iv1201.pos.dto.SaleInfoDto;
import se.kth.iv1201.pos.model.Observer;

public class TotalRevenueView implements Observer {
    private int totalCost = 0;

    public void notify(int totalCost)
    {
        this.totalCost += totalCost;
        System.out.println("Display: " + totalCost);
    }




}
