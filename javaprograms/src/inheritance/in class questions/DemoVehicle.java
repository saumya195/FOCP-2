import java.util.*;
class Vehicle
{
	void display()
	{
	System.out.print("this is a vehicle ");
	}
}
class Bike extends Vehicle
{
	void display()
	{
	System.out.print("this is a bike");
	}
}
class Car extends Vehicle
{
	void display()
	{
	System.out.print("this is a car");
	}
}
class DemoVehicle
{
public static void main(String args[])
{
Scanner S= new Scanner (System.in);
System.out.print("enter no of vehicles");
int n=S.nextInt();
switch(n)
{
	case 2:
	Bike B= new Bike();
	B.display();
	break;
   case 4:
   Car C=new Car();
   C.display();
   break;
 
   default:
   Vehicle V= new Vehicle();
   V.display();

}
}
	
}