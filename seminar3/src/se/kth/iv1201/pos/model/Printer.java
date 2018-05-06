package se.kth.iv1201.pos.model;

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
}
