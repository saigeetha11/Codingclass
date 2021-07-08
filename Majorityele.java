import java.util.*;
class Majorityele
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
int mj=findmajorityelement(a,n);
System.out.println(a[i]+" ");
}
}
static int majorityelement(int arr[ ], int size)
{
for(int i=0;i<n;i++)
{
int elem=arr[i];
int count=0;
for(int j=0;j<n;j++)
{
if(arr[i]==elem)
count+=1;
}
if(count>(n/2))
  return arr[i];
else 
 return -1;
}
}