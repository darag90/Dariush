package se.kth.iv1201.pos.dbhandler;

public class DatabaseErrorException extends Exception
{
    public DatabaseErrorException(int DatabaseInfo)
    {
        super("Database exception:  " + DatabaseInfo);
    }
}
