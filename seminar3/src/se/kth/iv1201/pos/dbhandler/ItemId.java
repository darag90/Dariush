/* package se.kth.iv1201.pos.dbhandler;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemId {
    private HashMap<Integer, String> itemid = new HashMap<>();

    public ItemId(){
        itemid.put(5555, "Godis");
        itemid.put(4444, "Tomater");
        itemid.put(3333, "Fisk");
        itemid.put(2222, "Pizza");
        itemid.put(1111, "Kött");
    }

 /*   private boolean match(int number){
        int len = itemid.size();
        for (int i = 0; i < len; i++){
            if (itemid.get(i).equals(number)){
                return true;
            }
        }
        return false;
    } */


  /*  private boolean getInfoItem(int id){
        HashMap availableCustomerId = itemid;
        if (availableCustomerId.get(id)==null)
            return false;
        else
            return true;
    }

    public String matchItemId (int number) throws DatabaseErrorException{
        boolean match = getInfoItem(number);
        if (!(match)){
            throw new  DatabaseErrorException(number);
        }
        return matchItemId(number);
    }
} */
