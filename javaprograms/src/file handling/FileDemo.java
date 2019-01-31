import java.io.File;
public class FileDemo {  
public static void main(String[] args) {
File f = null;
String strs = "test1.txt";
try {
f = new File(strs);
String a = f.getAbsolutePath(); 
System.out.print("\n"+a);
System.out.print("\nLength =" +f.length());
} catch (Exception e) {
e.printStackTrace();
}
}
}