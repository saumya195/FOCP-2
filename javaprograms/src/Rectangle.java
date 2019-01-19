class Rectangle
{
int l,b;
void display()
{
	System.out.print((l*b));
}
Rectangle(int x,int y)
{
	this.l=x;
	this.b=y;
}
}
class Box extends Rectangle
{
	int h;
	void display()
	{
	int a= l*b*h;
	System.out.print(a);
	Box (int x,int y,int z)
	{
	super(x,y);
	this.h =z;
	}
	}
	class Test
	{
	public static void main(String args[])
	{
	Box ob= new Box(1,1,2);
	ob.display();
	}
	}
