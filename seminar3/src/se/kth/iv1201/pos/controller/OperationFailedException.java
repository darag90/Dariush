package se.kth.iv1201.pos.controller;

public class OperationFailedException extends Exception
{
    public OperationFailedException(String msg, Exception cause)
    {
        super(msg, cause);
    }
}
