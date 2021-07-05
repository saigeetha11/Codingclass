import java.util.*;
class Secondlargeele
{
public static void main(String args[ ])
{
int n,temp;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of elements in Array: ");
n=sc.nextInt( );
System.out.print("Enter the Array elements: ");
int a[ ]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt( );
for(int i=0;i<n-1;i++)
for(int j=i+1;j<n;j++)
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
System.out.print("The Second largest element= ");
{
System.out.print(a[n-2]);
}
}
}