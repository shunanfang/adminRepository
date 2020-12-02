package dark.matrix.date;

import java.util.Calendar;

/**
 * User: 莱利
 * Date: 2020/10/30
 * Description: 获取年 月 日 时 分 秒
 */
public class DateTime {
    public static void main(String[] args) {

        //创建Calendar实例，调用对应的get方法获取

        Calendar  calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);//年
        int month = calendar.get(Calendar.MONTH);//月 0-11
        int day = calendar.get(Calendar.DATE); //日
        int hours = calendar.get(Calendar.HOUR_OF_DAY);// 时
        int minute = calendar.get(Calendar.MINUTE);//分
        int second = calendar.get(Calendar.SECOND);//秒

        System.out.println(year+" "+month+" "+day+" "+hours+" "+minute+" "+second);
    }
}
