import java.util.*;
class Pyramid
{
public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);
int i,j,k,n;
System.out.print("Enter the n value: ");
n=sc.nextInt( );
for(i=0;i<=n;i++)
{
for(k=0;k<=(n-i);k++)
{
  System.out.print(" ");
}
for(j=0;j<(2*i-1);j++)
   System.out.print("*");
System.out.print("\n");
}
for(i=n+1;i>=0;i--)
{
for(j=0;j<=n-i;j++)
{
System.out.print(" ");
}
for(k=0;k<2*i-1;k++)
 System.out.print("*");
System.out.print("\n");
}
}
}
