package se.kth.iv1201.pos.startup;


import se.kth.iv1201.pos.controller.Controller;
import se.kth.iv1201.pos.dbhandler.ExternalSystem;
import se.kth.iv1201.pos.model.PaymentController;
import se.kth.iv1201.pos.model.Printer;
import se.kth.iv1201.pos.view.View;


public class Main
{

    public static void main(String[] args)
    {
        /*denna metod startar programmet och delar ut nödvöndiga referenser*/

        Printer printer = new Printer();
        PaymentController paymentController = new PaymentController(printer);
        ExternalSystem externalSystem = new ExternalSystem(printer);
        Controller contr = new Controller(externalSystem, paymentController);
        View view = new View(contr);

        //starta exempel exikveringen av programmet
        view.sampleExecution();
    }
}

