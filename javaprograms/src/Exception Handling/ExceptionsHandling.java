import java.util.*;
public class ExceptionsHandling
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
	try{
		int a[]=new int[5];
		a[10]=50;
	}catch (ArrayIndexOutOfBoundsException b){System.out.println(b);}
	try{
            String s = "null";
            int i = Integer.parseInt(s);
            System.out.println("int value = " + i);
        
       }catch (NumberFormatException c){System.out.println(c);}
       try{
       	String s=null;
       	System.out.println(s.length());
       }catch (NullPointerException d){System.out.println(d);}
           
	}
	}
       
       


