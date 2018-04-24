package Reciept;

import java.lang.StringBuilder;


public class Reciept {
    private StringBuilder sb = new StringBuilder();
    private int cost;

    Reciept(int ItemCost, ItemList list){
        cost = ItemCost;
        int len = list.getList().size;
        for (int i = 0; i <= len; i++)
            sb.append(list.getList().get(i));
    }

    public String getSBToString(){
        return sb.toString();
    }

    public int getCost(){
        return cost;
    }

}
