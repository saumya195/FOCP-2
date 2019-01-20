/* author :SAUMYA GUPTA 18CSU195
   version:1.0.0
   PURPOSE- Write an application that inputs one number consisting of five digits from    the user, separates the number into its individual digits in the same order and prints the digits
  separated from one another by three spaces each.*/

import java.util.*;
class Digits{
		public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		char ch;
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		do {
			System.out.print("enter the 5 digit number");
			int n=scn.nextInt();
			num5=n%10;
			num4=(n%100)/10;
			num3=(n%1000)/100;
			num2=(n%10000)/1000;
			num1=n/10000;
			if(n>=10000&&n<=99999) {
				System.out.println(num1+"   "+num2+"   "+num3+"   "+num4+"   "+num5);
				
			}else {
				System.out.println("no contain more or less than 5 digits");
				continue;
			}
			System.out.println("press N to exit else any key to continue");
			ch=scn.next().charAt(0);
			if(ch=='N'||ch=='n') {
				break;
			}
		}while (true);
		
		

	}

}