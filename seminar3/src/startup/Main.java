package startup;


import Controller.Controller;
import view.View;

public class Main {

    public static void main(String[] args) {
        Controller contr = new Controller(ExternalSystem);
     //   PaymentController payController = new PaymentController(Printer);
        View view = new View(contr);
        view.sampleExecution();
    }
}

