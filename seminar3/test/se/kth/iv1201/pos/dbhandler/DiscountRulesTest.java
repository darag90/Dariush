package se.kth.iv1201.pos.dbhandler;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import se.kth.iv1201.pos.dto.SaleInfoDto;
import se.kth.iv1201.pos.model.Item;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
/* igentligen bör klasser testas som inte är beroend av andra klasser först, men i detta fall då bara
*två tester skapas var DiscountRules lämplig.
 */
public class DiscountRulesTest
{
    DiscountRules discountRulesWithPrice100;

    @Before
    public void setUp()
    {
        Item saleItem = new Item(1,1,"a");
        SaleInfoDto saleInfo = new SaleInfoDto(new LinkedList(),100, new Date(), saleItem);
        discountRulesWithPrice100 = new DiscountRules(saleInfo);
    }

    @After
    public void tearDown()
    {
        discountRulesWithPrice100 = null;
    }

    @Test
    public void discountInPrecent()
    {
        double expResult = 100*0.85;
        double result = discountRulesWithPrice100.DiscountInPrecent();
        double delta = 0.1;
        assertEquals("Item was not correctly discounted ", expResult, result, delta);
    }
}