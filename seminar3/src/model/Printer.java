package model;

import model.Reciept;

public class Printer {

    public Printer(){

    }

    public void printReciept (Reciept reciept){
        String stringprint = reciept.getSBToString();
        double cost = reciept.getCost();

        System.out.println("---------------Kvitto---------------");
        System.out.println("Item Id: " + stringprint);
        System.out.println("Total cost:" + cost);
        System.out.println("Välkommen åter");
        System.out.println("------------------------------------");
    }

 /*   public void printOfItemList(Item list){
        String listPrintout = list.resultToString(list);
        System.out.println(listPrintout);
    }  */


}
