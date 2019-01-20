/* author :SAUMYA GUPTA 18CSU195
   version:1.0.0
   PURPOSE - Write a program to merge two sorted arrays.*/
import java.util.*;

class Merge
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int i,j=0,k=0;
		int arr1[]= new int[5];
		int arr2[]= new int[5];
		int merge[]=new int[10];
		System.out.println("Enter 5 integer nos.");
		for(i=0;i<5;i++)
		{
			arr1[i]= scan.nextInt();
		}
		System.out.println("Enter 5 integer nos.");
		for(i=0;i<5;i++)
		{
			arr2[i]= scan.nextInt();
		}
		i=0;
		for(i=0;i<5;)
		{
			for(;j<5;)
			{
				if(arr1[i]<=arr2[j])
				{
					merge[k]=arr1[i];
					k++;
					i++;
					break;
				}
				else
				{
					merge[k]=arr2[j];
					j++;
					k++;
					break;
				}
			}
		}
		if(i<5)
		{
			for(;i<5;i++)
			{
				merge[k]=arr1[i];
				k++;
			}
		}
		else if(j<5)
		{
			for(;j<5;j++)
			{
				merge[k]=arr2[j];
				k++;
			}
		}
		System.out.println("the merged array is:");
		for(i=0;i<10;i++)
		{
			System.out.println(merge[i]);
		}
	}
}