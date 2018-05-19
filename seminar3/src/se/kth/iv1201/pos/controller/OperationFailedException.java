package se.kth.iv1201.pos.controller;


/** undantaget kastas när en operation har misslyckats*/
public class OperationFailedException extends Exception
{

    /**
     * skapar en ny instatns med ett medelande och info om varrör operationen misslyckades.
     *
     * @param msg inehåller ett medelande om vad som gick fel.
     * @param cause inehåller inforamtion om varför operationen misslyckades.
     */
    public OperationFailedException(String msg, Exception cause)
    {
        super(msg, cause);
    }
}
