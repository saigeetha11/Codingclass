import java.util.*;
class Facto
{
public void fact( )
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the n value: ");
   int n=sc.nextInt( );
   int fac=1;  
   while(n>0)
   {
     fac=fac*n;
     n--;
   }
   System.out.println("The factorial of a given number is: ");
   System.out.print(fac);
}
public void display( )
{
fact( );
}
public class Factorial
{
  public static void main(String args[ ])
  {
   Facto f=new Facto( );
   f.display( );
  }
}
}

/*--------------------------------------------------------------------------------------------
OUTPUT:
Enter tha n value:
10
The factorial of a given number is: 3628800*/