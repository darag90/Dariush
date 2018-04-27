package startup;


import controller.Controller;
import dbhandler.ExternalSystem;
import model.PaymentController;
import model.Printer;
import view.View;


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

