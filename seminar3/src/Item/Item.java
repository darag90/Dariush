
package Item;




public class Item {
    private String ItemId;
    private String quantityItem;
    private int cost;
    private boolean getItem = true;
    private  boolean result = true;

    public Item (int cost, String quantityItem, String ItemId){
        this.cost = cost;
        this.quantityItem = quantityItem;
        this.ItemId = ItemId;
    }

    public void setResult(boolean result) {
        this.result = result;
    }


}