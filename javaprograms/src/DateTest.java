
import java.util.*;
class Date 
{ 
    int monthdate;
    int daydate;
    int yeardate;
     
     Date (int month, int day, int year) {
        monthdate = month;
        daydate = day;
        yeardate = year;
    }
    
    void setMonth (int month) {
        monthdate = month;
    }
     
    int getMonth() {
        return monthdate;
    }
     
    void setday (int day) {
        daydate = day;
    }
     
     int getDay() {
        return daydate;
    }
     
     void setYear (int year ) {
        yeardate = year;
    }
     
     int getYear() {
        return yeardate;
    }
     
     void displayDate () {
        System.out.printf ("%d/%d/%d\n", getMonth(), getDay(), getYear());
    }
 
}
class DateTest {
    public static void main (String [] args)
     {
         
        Date display = new Date (0,0,0);
 
        Scanner input = new Scanner (System.in);
         
        int month;
        int day;
        int year;
         
        System.out.print ("Enter Month: ");
        month = input.nextInt();
        display.setMonth(month);
         
        System.out.println ();
         
        System.out.print ("Enter Day: ");
        day = input.nextInt();
        display.setday(day);
         
        System.out.println ();
         
        System.out.print ("Enter Year: ");
        year = input.nextInt();
        display.setYear(year);
         
        System.out.println ();
         
        display.displayDate();
 
    }
}
