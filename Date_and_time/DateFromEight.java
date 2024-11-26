package Date_and_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.function.Consumer;

import Collection_Work.index;
public class DateFromEight {
    public static void main(String[] args) throws InterruptedException{
        // LocalDate date = LocalDate.now();
        // System.out.println(date);
        // System.out.println(time);
        // System.out.println(date.getDayOfMonth());
        // System.out.println(date.getDayOfYear());
        // System.out.println(time.of(2, 20, 3));
        // System.out.println(date.getMonthValue());
        LocalTime time = LocalTime.now();

        System.out.println("Prinitng Time ");
        for(int i=0;i<time.getSecond();i++){
             time = LocalTime.now();

            System.out.println(time.getMinute() + " " + time.getSecond() + " " + time.getNano());
            Thread.sleep(1000);
        }
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Ashish");
        list1.add("Prabhat");
        list1.add("Prashant");
        list1.add("Rahul");
        list1.forEach(i-> System.out.println(i));
    }
}
