
package se.kth.iv1201.pos.startup;

import se.kth.iv1201.pos.controller.Controller;
import se.kth.iv1201.pos.dbhandler.ExternalSystem;
import se.kth.iv1201.pos.model.PaymentController;
import se.kth.iv1201.pos.model.Printer;
import se.kth.iv1201.pos.view.View;
import se.kth.iv1201.pos.view.ErrorMessageHandler;
import se.kth.iv1201.pos.view.LogHandler;

/**
 * Main start programmet.
 */

public class Main
{
    /**
     * Main startar programmet genom att skapa skapa de objekt som behöver finnas i början av försäljningen
     * och delar ut nödvändiga referenser.
     * @param args en parameter som inehåller argument om om programmat startas från en terminal/kommandoskal(andvänds ej)
     */
    public static void main(String[] args)
    {
        /*denna metod startar programmet och delar ut nödvöndiga referenser*/
        Printer printer = new Printer();
        PaymentController paymentController = new PaymentController(printer);
        ExternalSystem externalSystem = new ExternalSystem(printer);
        Controller contr = new Controller(externalSystem, paymentController);
        ErrorMessageHandler errorMessageHandler = new ErrorMessageHandler();
        try
        {
            LogHandler logHandler = new LogHandler();
            View view = new View(contr, errorMessageHandler, logHandler);

            /*starta exempel exikveringen av programmet*/
            view.sampleExecution();
        }
       catch (Exception e){}
    }
}

