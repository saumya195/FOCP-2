public class Check
{
	public static void main(String args[])
	{
	try{
Class.forName("Saumya");
}catch(ClassNotFoundException e){System.out.println(e);}
System.out.println("rest of the code executed");
	}
}