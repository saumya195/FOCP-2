/* author :SAUMYA GUPTA 18CSU195
   version:1.0.0
   PURPOSE-  Write a Java program that reads in two floating-point numbers and tests   whether they are the same up to three decimal places.*/
import java.util.*;
class FloatingNumber{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Input floating number ");
		double x=scn.nextDouble();
		System.out.print("another floating number");
		double y=scn.nextDouble();
         x=Math.round(x*1000);
         x=x/1000;
         y=Math.round(y*1000);
         y=y/1000;
         if(x==y) {
        	 System.out.println("they are same upto three decimal place");
         }else {
        	 System.out.println("they are different");
         }
	}
}