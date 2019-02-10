

package org.school.util;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateUtil_1 {
   private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

   public static String getDateAsString(Date date)
    {
        return dateFormat.format(date);
    }
}
