
package dbhandler;


import model.Printer;
import model.Item;

public class ExternalSystem {
    private Printer printer = new Printer();
    private int Item;
  //  private CustomerRegister customerRegister = new CustomerRegister();


    public ExternalSystem(Printer printer)
    {
        this.printer = printer;
    }

 /*   public CustomerRegister getCustomerRegister(){
        return CustomerRegister;
    } */

    public Item getItem(int id){


        //@todo borde kanse fixa en fakad databas??
        int a = 3;
        int v = 4;
        return new Item();

    }









  /*  public boolean InformationSystem(int itemCost, String itemList){
        return true;
    } */


}