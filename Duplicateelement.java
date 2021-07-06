import java.util.*;
class Duplicateelement
{
public static void main(String args[ ])
{
int n,temp;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of elements in Array: ");
n=sc.nextInt( );
int a[ ]=new int[n];
System.out.print("Enter the Array elements: ");
for(int i=0;i<n;i++)
a[i]=sc.nextInt( );
for(int i=0;i<n-1;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
for(int k=j;k<n-1;k++)
{
a[k]=a[k+1];
}
n--;
j--;
}
}
}
System.out.println("Array elements without Duplicate elements are: ");
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}