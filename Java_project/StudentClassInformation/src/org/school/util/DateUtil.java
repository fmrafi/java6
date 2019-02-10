

package org.school.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateUtil {
private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static Date getDateFromString(String strDate)
    {
        Date date = null;
        try
        {
            date = dateFormat.parse(strDate);
        }
        catch(ParseException ex)
        {
            ex.printStackTrace();
        }
        return date;
    }
}
