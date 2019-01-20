/* author :SAUMYA GUPTA 18CSU195
   version:1.0.0
   PURPOSE - Create a class Circle with instance variable radius and member functions:
   a) area( ) b) circumference( ) c) display( ). Write a test application named CircleTest that demonstrates class Circle’s capabilities.*/

class Circle
{
	int radius;
	double area()
	{
	return (3.14*radius*radius);
	}
	double circumference()
	{
	return(2*3.14*radius);
	}
	void setDim( int r)
	{
		radius=r;
	}
}
class CircleTest
{
	public static void main(String args[])
	{
	Circle C1=new Circle();
	double area;
	double circumference;
	C1.setDim(5);
	area= C1.area();
	circumference= C1.circumference();
	System.out.println("area is" + area);
	System.out.println("circumference is" + circumference);
	}
}