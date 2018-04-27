package model;

public class Item {
    private String itemId;
    private String itemQuantity;
    private int itemCost;
    private boolean result = false;


    public Item(int itemCost, String itemId, String itemQuantity){
        this.itemCost = itemCost;
        this.itemId = itemId;
        this.itemQuantity = itemQuantity;
    }

    /**
     * ställer in resultatet om det finns flera item av samma Id
     */
    public void QuantityItem(boolean result){
         this.result = result;
    }

    public String getItemId(){
        return itemId;
    }

    public String getItemQuantity(){
        return itemQuantity;
    }

    public int getItemCost(){
        return itemCost;
    }

    /**
     * jämför om två item av samma id finns
     * @param object Item tittar om den önskade item finns
     * @return boolean sant om lika falsk om inte
     */

    public boolean equals(Object object){
        if (object == null){
            return false;
        }
        Item item = (Item)object;

        if(!(this.itemCost == item.getItemCost())){
            return false;
        }

        if(!(this.itemId == item.getItemId())){
            return false;
        }

        if (!(this.itemQuantity == item.getItemQuantity())){
            return false;
        }

        return true;
    }

    public static class ItemList {
        private int cost = 0;
        private List<Item> list = new ArrayList<>();

        public ItemList(){
        }

        public List<Item> getList(){
            return list;
        }

        /**
         * returnerar alla kostnader för item i lista
         * @return kostnad
         */
        public int getCost(){
            return cost;
        }

        /**
         * lagrar item i en lista och uppdaterar kostnaden för hela lista
         */

        public void itemDTO(Item item){
            list.add(item);
            cost += item.getCost();
        }

        /**
         * tar en lista av valda item och returnerar en sträng som en lista
         */

        public String resultOfItemList (ItemList list) {
            StringBuilder sb = new StringBuilder();
            int len = list.getList().size();
            for (int i = 0; i < len; i++) {
                sb.append("item list");
                sb.append(list.getList().get(i).getItemId());
                if (list.getList().get(i).equals(list)) {               // osäker
                    sb.append("Result: available itemId" + " ");
                    sb.append("\n");
                } else {
                    sb.append("Result: itemId not available" + " ");
                    sb.append("\n");
                }

            }
            return sb.toString();
        }



    }
}
