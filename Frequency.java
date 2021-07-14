import java.util.*;
public class Frequency
{
   public static void main(String args[ ])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of Elements: ");
     int n=sc.nextInt( );
     int a[ ]=new int[n];
     System.out.println("Enter the array elements: "+" ");
     for(int i=0;i<n;i++)
     a[i]=sc.nextInt( );
     System.out.println("Enter the number: ");
     int k=sc.nextInt( );
     System.out.print("Frequency of the number is: ");
     freq(a,n,k); 
    }
static void freq(int a[ ],int n,int k)
{
 int count=0;
 for(int i=0;i<n;i++)
 if(a[i]==k)
 {
   count++;
 }
System.out.println(count);
}
}
-------------------------------------------------------------------------------------------------
OUTPUT:
Enter the number of Elements:
8
Enter the array elements:
2 5 1 6 7 8 1 1 
Enter the number:
1
Frequency of the number is: 3
    