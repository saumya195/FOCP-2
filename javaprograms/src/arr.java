import java.util.*; 
class index
 { 
public static int findIndex(int array[],int t)
{
   if (array==null)
   {
    return -1;
}
int i=0;
while(i<10)
{
    if (array[i]==t)
    {
        return i+1;
    }
    else
    {
        i=i+1;
    }
    return -1;
}
public static void main(String args[])
{
    int array[],i,t;
    array=new int[10];
    System.out.println("enter elements");
    Scanner S=new Scanner (System.in);
    for(i=0;i<10;i++)
        array[i]=S.nextInt();
    System.out.print("enter element");
    t=S.nextInt();
    System.out.print("index position of element is: " + findIndex (array,i));
}
    }
    
   
