import java.util.*;
class Reverseofno
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the Number: ");
int n=s.nextInt( );
int r,rev=0;
//int x=rev;
while(n>0)
{
r=n%10;
rev=-(-(rev*10)+r);
n=n/10; 
}
System.out.println("Reverse= "+rev);
}
}