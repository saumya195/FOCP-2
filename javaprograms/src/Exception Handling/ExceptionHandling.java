import java.util.*;
public class ExceptionHandling
{
public static void main(String args[])
{
	Scanner S=new Scanner(System.in);
	System.out.print("enter value of m and n");
	int m=S.nextInt();
	int n=S.nextInt();
	try{
	int i=m/n;
	System.out.print("i is :"+ i);
	}catch (ArithmeticException e){System.out.println(e);}
}
}
