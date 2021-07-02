import java.util.*;
class Primenumbers
{
public static void main(String args[ ])
{
int i,j,count=0,n,count1=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the n value: ");
n=sc.nextInt( );
System.out.println("The Prime number between 1 to n: ");
for (i=1;i<=n;i++)
{
count=0;
for(j=1;j<=i;j++)
if(i%j==0)
{
count++;
}
if(count==2)
{
System.out.print(i+",");
count1++;
}
}
System.out.println(" ");
System.out.println("Total number of Prime Numbers= "+count1);
}
}