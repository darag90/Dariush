package se.kth.iv1201.pos.view;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalTime;

public class ErrorMessageHandler extends  ErrorHandlerBase
{
    /**
     * Displays the specified error message.
     *
     * @param msg The error message.
     */
    void showErrorMsg(String msg)
    {
        StringBuilder errorMsgBuilder = new StringBuilder();
        errorMsgBuilder.append(createTime());
        errorMsgBuilder.append(", ERROR: ");
        errorMsgBuilder.append(msg);
        System.out.println(errorMsgBuilder);
    }
}
