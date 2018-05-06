package se.kth.iv1201.pos.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest
{

    //private Item itemWithNoData;
    private Item item;

    @Before
    public void setUp()
    {
        item = new Item(1234,15,"Banan");
    }

    @After
    public void tearDown()
    {
        item = null;
    }


    @Test
    public void increaseItemQuantity()
    {
        item.increaseItemQuantity();
        int expResult = 1;
        int result = item.getItemQuantity();
        assertEquals("Item increase quantity "+ "did not increase quantity with one.", expResult, result);
    }

    @Test
    public void notEqualsNull()
    {
        Item itemWithDiffId = null;
        Boolean expResult = false;
        Boolean result = item.equals(itemWithDiffId);
        assertEquals("Item instances with Null "+ "are equal.", expResult, result);

    }

    @Test
    public void equals()
    {
        Item itemEquals = new Item(1234,15,"Banan");
        Boolean expResult = true;
        Boolean result = item.equals(itemEquals);
        assertEquals("Item instances with different entrys "+ "are not equal.", expResult, result);
    }

    @Test
    public void notEqualsWithDifferentId()
    {
        Item itemWithDiffId = new Item(1235,15,"Banan");
        Boolean expResult = false;
        Boolean result = item.equals(itemWithDiffId);
        assertEquals("Item instances with different id:s "+ "are equal.", expResult, result);

    }

    @Test
    public void notEqualsWithDifferentCost()
    {
        Item itemWthDiffCost = new Item(1234,20,"Banan");
        Boolean expResult = false;
        Boolean result = item.equals(itemWthDiffCost);
        assertEquals("Item instances with different costs "+ "are equal.", expResult, result);
    }

    @Test
    public void notEqualsWithDifferentName()
    {
        Item itemWithDiffName = new Item(1234,15,"Banana");
        Boolean expResult = false;
        Boolean result = item.equals(itemWithDiffName);
        assertEquals("Item instances with different Names "+ "are equal.", expResult, result);
    }
}