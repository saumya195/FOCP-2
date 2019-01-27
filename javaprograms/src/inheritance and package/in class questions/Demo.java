import java.util.*;
abstract class figure
{
	double dim1;
	double dim2;
	figure(double a, double b)
	{
	dim1=a;
	dim2=b;
	}
	//area is now an abstract method
	abstract double area();
	}
	class Rectangle extends figure
	{
	Rectangle(double a, double b)
	{
	super(a,b);
	}
	// override area for rectangle
	double area()
	{
	System.out.println("Inside area for Rectangle");
	return dim1*dim2;
	}
	}
class Demo
{
	public static void main(String arg[])
	{
	double dim1,dim2,ar;
	Scanner S=new Scanner(System.in);
	System.out.print("enter dimensions");
	dim1=S.nextDouble();
	dim2=S.nextDouble();
		Rectangle r=new Rectangle(dim1,dim2);
	ar=r.area();
	System.out.print("area is :" +ar);

	}
}	
	