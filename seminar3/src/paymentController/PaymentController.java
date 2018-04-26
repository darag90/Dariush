package paymentController;

import itemList.ItemList;
import printer.Printer;
import reciept.Reciept;

public class PaymentController {
    private Printer printer;

    public PaymentController(Printer printer){
        this.printer = printer;

    }

    public int cashPayment(int cashAmount, int itemCost, ItemList list){
        Reciept reciept = new Reciept(itemCost, list);
        printer.printReciept(reciept);

        int change = cashAmount - itemCost;
        System.out.println("Change" + change);
        return change;
    }





}