package se.kth.iv1201.pos.model;

import se.kth.iv1201.pos.dto.SaleInfoDto;
import java.util.Date;
import java.util.LinkedList;



/**
 *  Denna klass representerar enförsälning. Den lagrar exempelvis de registrerade varorna
 *  @author Dariush Aghadai Ghaderi, darag@kth.se
 *  @author Simon Lagerqvist, simlag@kth.se
 *  @version 1.9
 *  @since 2018-05-06
 */
public class Sale
{
    private final Date saleTime;
    private LinkedList<Item> listOfItems = new LinkedList<Item>();
    private int totalCost;
    private Item lastItem;


    /**kontruktorn lagrar tiden när en försäljning startar*/
    public Sale()
    {
        this.saleTime = new Date();
    }

    /**
     * metoden returnerar den totala kostnaden, kostnaden beräknas alteftersom fler
     * items registreras.
     * @return den totala kostnaden för afären
     */
    public int getTotalCost()
    {
        return totalCost;
    }

    /**
     *Denan metod hämtar en <code>SaleInfoDto</code> med information om försäljningen.
     * @return en dto med information om den aktuella försäljningen
     */
    public SaleInfoDto getSale()
    {
        //skapar en kopia för att få bra inkapsling
        return new SaleInfoDto((LinkedList<Item>) listOfItems.clone(),totalCost,saleTime,lastItem);
    }

    public SaleInfoDto finishRegistration()
    {
       double tax = (double)totalCost*0.12;
        SaleInfoDto saleInfoDto = getSale();
        saleInfoDto.setTax(tax);
        saleInfoDto.setTotalCost(totalCost+tax);
        return saleInfoDto;
    }

    /**
     * lägger till en ny vara/<code>item</code> i försälningen.
     * @param item ett object som symboliserar en vara som man vill läga till i försäljningen.
     */
    public void addItem(Item item)
    {
        this.lastItem = item;
        boolean itemAlredyExist = false;
        for (Item currentItem : listOfItems)
        {
            itemAlredyExist = currentItem.equals(item);
            //System.out.println(itemAlredyExist);
            if(itemAlredyExist)
            {
                lastItem = currentItem;
                lastItem.increaseItemQuantity();
                break;
            }
        }


        if (!itemAlredyExist)
        {
            item.increaseItemQuantity();
            this.listOfItems.add(item);
        }
        calulateTotalCost();

    }

    /**
     * en <code>private</code> metod som andvänds för att beräkna den aktuella kostnaden.
     */
    private void calulateTotalCost()
    {
            totalCost += lastItem.getItemCost();
    }

}
