package se.kth.iv1201.pos.dbhandler;

public class InvalidItemException extends Exception
{
    public InvalidItemException(int invaliedItem) {
        super("This item whit the specified identifier is not found: " + invaliedItem);
    }
}
