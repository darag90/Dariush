package se.kth.iv1201.pos.dbhandler;


/** undantaget kastas när varan inte kan hämtas p.g.a. något fel som uppstod när konatkt togs med datatbasen*/
public class DatabaseErrorException extends RuntimeException
{
    /**
     * skapar en ny instatns med ett medelande som specifiserar för vilket id som det inte finns en vara.
     *
     * @param DatabaseInfo information om varför inte databasen kunde kontaktas.
     */
    public DatabaseErrorException(int DatabaseInfo)
    {
        super("Database exception:  " + DatabaseInfo);
    }
}
