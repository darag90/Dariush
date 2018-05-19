
package se.kth.iv1201.pos.dbhandler;


/** Undantaget kastas när varan som sökts efter inte kunde hittas i inventerings katalogen*/

public class InvalidItemException extends Exception
{

    /**
     * skapar en ny instatns med ett medelande som specifiserar för vilket id som det inte finns en vara.
     *
     * @param invaliedItem Id:t för varan som inte fanns.
     */
    public InvalidItemException(int invaliedItem) {
        super("This item with the specified identifier is not found: " + invaliedItem);
    }
}
