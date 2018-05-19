package se.kth.iv1201.pos.dbhandler;

public class DatabaseErrorException extends RuntimeException
{
    public DatabaseErrorException(int DatabaseInfo)
    {
        super("Database exception:  " + DatabaseInfo);
    }
}
