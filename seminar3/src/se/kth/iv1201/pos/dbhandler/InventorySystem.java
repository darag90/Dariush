package se.kth.iv1201.pos.dbhandler;

import java.util.*;

import se.kth.iv1201.pos.dto.SaleInfoDto;
import se.kth.iv1201.pos.model.Item;
public class InventorySystem
{
/*Denna class borde igentligen kontakta det externa inveteringssystemet,
men då ett sådant inte finns kommer den istället agera som ett litet
inventerings system för att visa programmets funktionalitet. För enkelhetens skull
kommer varoran vara inlagda som Item objekt från början.
 */

    private Map<Integer, Item> itemsInInventory = new HashMap<>();

    /**
     * Denna metod anger då item id, costnaden, och dess namne
     * som exemel görs följande varor
     * -gurka: id 1234
     * -banan: id 5678
     * -tandkräm id:1357
     */

    public InventorySystem()
    {

        this.itemsInInventory.put( 1234, new Item(1234,20,"Gurka ekologisk") );
        this.itemsInInventory.put( 5678, new Item(1234,40,"Banan ica basic") );
        this.itemsInInventory.put( 1357, new Item(1234,60,"tandkräm oral-b") );
    }

    /**
     * en metod för att hämta information om varorna
     * @param id items id
     * @return returnera varans id
     */
    public Item getItem (int id)throws InvalidItemException, DatabaseErrorException
    {
        return matchItemId(id);
    }


    /**
     * kontrollerar om den inskannade varan matchar den varan som
     * finns i inventory system
     * @param id identifikationen för varan
     * @return returnerar om varan finns i systemet eller inte
     */

    private boolean getInfoItem(int id){
        //Map availableItemId = itemsInInventory;
        return itemsInInventory.get(id) != null;
    }


    /**
     * Metoden tar en item som ett argument och kontrollerar om varan finns registerad
     * @param number tillgänglig nummer
     * @throws InvalidItemException undantag
     */

    public Item matchItemId (int number) throws InvalidItemException, DatabaseErrorException
    {
        boolean match = getInfoItem(number);

        if(number == 2222)
            throw new DatabaseErrorException(number);
        else if (!(match))
            throw new  InvalidItemException(number);
        else if(number == 2222)
            throw new DatabaseErrorException(number);
        else
            return itemsInInventory.get(number);
    }

}
