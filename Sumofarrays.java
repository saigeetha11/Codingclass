import java.util.*;
class Sumofarrays
{
public static void main(String args[ ])
{
int s=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of elements in Array: ");
int n=sc.nextInt( );
int a[ ]=new int[n];
System.out.println("Enter the elements in Array: ");
for(int i=0;i<n;i++)
a[i]=sc.nextInt( );
System.out.print("The Sum of elements of Array= " );
for(int i=0;i<n;i++)
s=s+a[i];
System.out.print(s+ " ");

}
}

