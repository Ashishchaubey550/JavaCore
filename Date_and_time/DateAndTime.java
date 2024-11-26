package Date_and_time;

import java.util.Date;

public class DateAndTime {
    public static void main(String []args){
        Date d = new Date();
        System.out.println(d);
        long time=d.getTime();
        System.out.println("Print in long Format: " + time);
        java.sql.Date d2 = new java.sql.Date(time);
        System.out.println("Print from Sql date package: " + d2);
    }
}
