package dark.matrix.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * User: 莱利
 * Date: 2020/10/30
 * Description: 格式化日期的方法
 */
public class DateFormat {

    public static void main(String[] args){
        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        System.out.println(dateFormat(date));
        System.out.println("------------------------");
        System.out.println(dateFormat(localDate));
        System.out.println("------------------------");
        System.out.println(timeFormat(localTime));
    }


    public static String  dateFormat(Date date){
        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    public static String dateFormat(LocalDate localDate){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return localDate.format(dtf);
    }



    public static String  timeFormat(LocalTime localTime){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        return localTime.format(dtf);
    }
}
