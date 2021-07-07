import java.util.*;
class Primeinarray
{
public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of elements in Array: ");
int n=sc.nextInt( );
int a[ ]=new int[n];
System.out.println("Enter the Array elements: ");
for(int i=0;i<n;i++)
a[i]=sc.nextInt( );
System.out.println("the Prime Array elements: ");
for(int i=1;i<n;i++)
{
int count=1;
for(int k=2;k<a[i];k++)
{
if(a[i]%k==0)
{
count=0;
break;
}
}
if(count==1)
{
System.out.print(a[i]+" ");
}
}
}
}


Output:
n=5
{89,25,43,2,7}
the prime array elements:
43 2 7