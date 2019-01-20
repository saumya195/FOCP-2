/* author :SAUMYA GUPTA 18CSU195
   version:1.0.0
   PURPOSE - Write a Java program that asks the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not
  a letter (between a and z or A and Z), or is a string of length > 1, print an error message.*/

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