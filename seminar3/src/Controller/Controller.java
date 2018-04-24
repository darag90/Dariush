
package Controller;



import ExternalSystem.ExternalSystem;
import PaymentController.PaymentController;


public class Controller {
    private PaymentController payController;
    private ExternalSystem regExternalSystem;



    public Controller(ExternalSystem regExternalSystem, PaymentController payController) {
        this.regExternalSystem = regExternalSystem;
        this.payController = payController;
    }

    public void startSale() {
    }

  //  public void item(){}
}
