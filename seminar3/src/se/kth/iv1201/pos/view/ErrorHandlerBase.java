package se.kth.iv1201.pos.view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ErrorHandlerBase
{
    String createTime()
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
