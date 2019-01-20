/* author :SAUMYA GUPTA 18CSU195
   version:1.0.0
   PURPOSE-  Use a one-dimensional array to solve the following problem: Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number is read, display 
   it only if it’s not a duplicate of a number already read. Provide for the “worst case,” in which all five numbers are different. Display the complete set of unique values input after the
   user enters each new value. The program should not use any function other than main ( ) functions.*/

import java.util.Scanner;
class Number
{
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);
int[] array = new int[5];
int count = 0; 
int entered = 0; 
int num = 0;
while (entered < array.length)
{
System.out.println("Enter number: ");
num = input.nextInt();
if ((num >= 10) && (num <= 100)) {
boolean containsNumber = false;
entered++;
for (int i = 0; i < array.length; i++)
{
if (array[i] == num)      
containsNumber = true;
} 
if (!containsNumber)
{
array[count] = num;
count++;
}
 else
System.out.printf("%d has already been entered\n", num);
}
else
System.out.println("number must be between 10 and 100");
for (int i =0;  i< entered; i++) {
System.out.print(array[i] + " ");
}
System.out.println();
} 
}
}