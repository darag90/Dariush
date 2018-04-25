package view;


import controller.Controller;


public class View {
    private Controller contr;



    public View(Controller contr) {
        this.contr = contr;
    }

    public void sampleExecution() {
        contr.startSale();
       // contr.item();


    }
}

