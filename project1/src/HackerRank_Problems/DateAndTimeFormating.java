package HackerRank_Problems;

import java.util.Calendar;
import java.util.Locale;

public class DateAndTimeFormating {
    public static String findDay(int day, int month,int year){

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH,month-1);
        cal.set(Calendar.DAY_OF_MONTH,day);
        cal.set(Calendar.YEAR,year);

        String ans = cal.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, Locale.US);
        return ans;
    }
    public static void main(String[] args) {
//        Calendar rightnow = Calendar.getInstance();
//        System.out.println(rightnow.getTime());
//        System.out.println(rightnow.get(3));
//        System.out.println(rightnow.getCalendarType());
//        rightnow.get
        int day = 5;
        int month = 8;
        int year = 2015;

        String ans = findDay(day,month,year);
        System.out.println(ans);
    }
}
