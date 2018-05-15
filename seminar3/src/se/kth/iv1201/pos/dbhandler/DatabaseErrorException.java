package se.kth.iv1201.pos.dbhandler;

public class DatabaseErrorException extends Exception
{
    public DatabaseErrorException(int DatabaseInfo)
    {
        super("This item with the specified identifier is not found: " + DatabaseInfo);
    }
}
