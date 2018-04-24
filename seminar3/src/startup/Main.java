package startup;


import Controller.Controller;
import PaymentController.PaymentController;
import Printer.Printer;
import view.View;

public class Main {

    public static void main(String[] args) {
        Controller contr = new Controller();
        Printer printer = new Printer();
        PaymentController payController = new PaymentController(Printer);
        View view = new View(contr);
        view.sampleExecution();
    }
}

