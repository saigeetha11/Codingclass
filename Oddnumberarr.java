import java.util.*;
class Oddnumberarr
{
public static void main(String args[ ])
{
int n,temp;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of elements: ");
n=sc.nextInt( );
System.out.println("Enter the array elements: ");
int a[ ]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt( );
for(int i=0;i<n-1;i++)
for(int j=0;j<n-i-1;j++)
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
System.out.print("Odd numbers in ascending order= ");
for(int i=0;i<n;i++)
{
if(a[i]%2==1)
{
System.out.print(a[i]+" ");
}
}
}
}