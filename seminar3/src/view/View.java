package view;


import controller.Controller;
import model.Item;
import model.PaymentController;
import java.lang.StringBuilder;


public class View {
    private Controller contr;



    public View(Controller contr) {
        this.contr = contr;
    }

    public void sampleExecution() {
        contr.startSale();
       // contr.item();


        // skriver ut godkännandet för betalning för change
        //boolean change = contr.cashPayment();
        //System.out.println("authirization was" + change);


    }
}

