package model;

import java.lang.StringBuilder;



public class Reciept {
    private StringBuilder sb = new StringBuilder();
    private int cost;


   public Reciept(int itemCost, Item.ItemList list){
        cost = itemCost;
        int len = list.getList().size();
        for (int i = 0; i <= len; i++)
            sb.append(list.getList().get(i).getItemId());
    }

    public String getSBToString(){
        return sb.toString();
    }

    public int getCost(){
        return cost;
    }

}