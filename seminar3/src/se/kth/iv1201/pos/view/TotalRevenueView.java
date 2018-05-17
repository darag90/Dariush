package se.kth.iv1201.pos.view;

import se.kth.iv1201.pos.dto.SaleInfoDto;
import se.kth.iv1201.pos.model.Observer;

public class TotalRevenueView implements Observer {
    private int toatalCost = 0;

    public void notify(int toatalCost)
    {
        this.toatalCost += toatalCost;
        System.out.println("Display: " + toatalCost);
    }













}
