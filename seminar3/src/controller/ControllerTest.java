package controller;

import externalSystem.ExternalSystem;
import paymentController.PaymentController;
import printer.Printer;


public class ControllerTest {
    private Printer printer = new Printer();
    private PaymentController paymentController = new PaymentController(printer);
    private ExternalSystem externalSystem = new ExternalSystem(printer);
    private Controller controller = new Controller(externalSystem);


    public void testCashPayment(){
        int expResult = 198;
        int result = controller
    }




}
