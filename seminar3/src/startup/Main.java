package startup;


import controller.Controller;
import externalSystem.ExternalSystem;
import paymentController.PaymentController;
import printer.Printer;
import view.View;


public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        PaymentController paymentController = new PaymentController(printer);
        ExternalSystem externalSystem = new ExternalSystem(printer);
        Controller contr = new Controller(externalSystem);
        View view = new View(contr);
        view.sampleExecution();
    }
}

