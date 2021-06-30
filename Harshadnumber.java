import java.util.*;
class Harshadnumber
{
public static void main(String args[ ])
{
int x,n,r,s=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the n value: ");
n=sc.nextInt();
x=n;
while(n!=0)
{
r=n%10;
s=s+r;
n=n/10;
}
if(x%s==0)
System.out.println(x+ "is a Harshad Number");
else if(x%s!=0)
System.out.println(x+ "is not Harshad Number");
}
}

