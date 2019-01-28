public class Question4
{
	private static int i = null;	
	public static void main(String[] args) 
	{
		try {
			System.out.println(i.toString());
		} catch(NullPointerException e) {
			System.out.println("Caught NullPointerException");
			e.printStackTrace();
		} 
		try {
			i = 10;
			System.out.println(i.toString());
		} catch(NullPointerException e) {
			System.out.println("Caught NullPointerException");
			e.printStackTrace();
		} finally {
			System.out.println("Got through it");
		}
	}	
}