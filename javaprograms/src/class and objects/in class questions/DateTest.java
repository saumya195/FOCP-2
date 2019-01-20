/* author :SAUMYA GUPTA 18CSU195
   version:1.0.0
   PURPOSE-2. Create a class called Date that includes three instance variables—a month (type int), a day (type int) and a year (type int). Provide a method displayDate that displays the 
   month, day and year separated by forward slashes (/). Write a test application named DateTest that demonstrates class Date’s capabilities.*/

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
