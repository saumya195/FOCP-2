 import java.util.*;
 class Alphabet 
 {

    public static void main(String args[]) 
    {
    	char ch;
    	Scanner S =new Scanner (System.in);
        System.out.print("Enter a character");
	ch=S.next( ).charAt(0);
       

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Entered character "+ch+" is Consonant");
		else
		System.out.println("Not an alphabet");	
    }
}