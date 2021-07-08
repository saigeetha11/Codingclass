import java.util.*;
class Singleelement
{
public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements in the array : ");
int n=sc.nextInt();
int a[ ]=new int[n];
System.out.println("Enter the array elements : ");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
System.out.println("Single element in the array is: ");
Arrays.sort(a);
for(int i=0;i<n;i++)
{
int c=0;
for(int j=0;j<n;j++)
{
if(a[i]==a[j])
{
c++;
}
}
if(c==1)
System.out.print(a[i]+" ");
}
}
}

Output:
n=8
elements: {1,2,1,2,3,1,2,1}
Single element in the array is: 3