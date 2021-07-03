import java.util.*;
class Automorphicno
{
public static void main(String args[ ])
{
int n,sqr;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the N value: ");
n=sc.nextInt( );
sqr=n*n;
System.out.println(+sqr);
if(sqr%100==n)
{
System.out.println(n+ " is Automorphic number");
}
else
System.out.println(n+ " is not an Automorphic number");
}
}
