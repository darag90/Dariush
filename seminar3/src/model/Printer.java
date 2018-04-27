package model;

import model.Reciept;

public class Printer {

    public Printer(){

    }

    public void printReciept (Reciept reciept){
        String stringprint = reciept.getSBToString();
        int cost = reciept.getCost();

        System.out.println("Item Id: " + stringprint);
        System.out.println("Item cost:" + cost);
    }

 /*   public void printOfItemList(Item list){
        String listPrintout = list.resultToString(list);
        System.out.println(listPrintout);
    }  */


}
