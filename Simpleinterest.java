import java.util.*;
public class Simpleinterest
{
   public static void main(String args[ ])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the value of P: ");
     float p=sc.nextFloat( );
     System.out.println("Enter the value of T: ");
     float t=sc.nextFloat( );
     System.out.print("Enter the value of R: ");
     float r=sc.nextFloat( );
     System.out.println("Simple Interest= ");
     simpleinterest(p,t,r);
    }
static void simpleinterest(float p,float t,float r)
{
float i=(p*t*r)/100;
System.out.println(i);
}
}
------------------------------------------------------------------------------
OUTPUT:
Enter the value of P:
100
Enter the value of T:
2
Enter the value of R:
5
Simple Interest= 10.0
