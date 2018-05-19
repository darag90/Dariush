package se.kth.iv1201.pos.view;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LogHandler extends ErrorHandlerBase
{
    /*i detta fall skulle ett färdigt API kunna andvändas, men har valde vi att göra en
    egen klass liknande den på sid 173 i boken objektorienterad design av Leif Lindbäck.
     */
    private static final String LOG_FILE_NAME = "pos_exception_logg";
    private PrintWriter logFile;

    public LogHandler()throws IOException //addera när förståelse uppnåts över varför denna exeception bör kastas
    {
        logFile = new PrintWriter(new FileWriter(LOG_FILE_NAME), true);
    }

    public void logException(Exception exception)
    {
        StringBuilder logMsgBuilder = new StringBuilder();
        logMsgBuilder.append(createTime());
        logMsgBuilder.append(", Exception was thrown: ");
        logMsgBuilder.append(exception.getMessage());
        logFile.println(logMsgBuilder);
        exception.printStackTrace(logFile);
    }
}
