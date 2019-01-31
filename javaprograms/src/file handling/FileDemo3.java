import java.io.*;
import java.util.*;
class FileDemo3
{
	public static void main(String[] args)
	{
	File f=null;
	try{
	f=new File("File.txt");
	FileWriter fout=new FileWriter(f);
	BufferedWriter bout=new BufferedWriter(fout);
	Scanner sc=new Scanner(System.in);
	System.out.print("\n enter serial number");
	bout.write(sc.nextInt());
	System.out.print("\nenter first name");
	bout.write(sc.next());
	System.out.print("\nenter CGPA");
	bout.write(sc.nextInt());
	System.out.print("\nenter grade");
	bout.write(sc.next().charAt(0));
	bout.close();
}catch(Exception e) {e.printStackTrace();}
	}
}
