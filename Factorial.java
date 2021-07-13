import java.util.*;
public class Factorial
{
  public static void main(String args[ ])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the n value: ");
   int n=sc.nextInt( );
   System.out.print("The factorial of a given number is: ");
   facto(n);
  }
static void facto(int n)
{
   int fact=1;  
   while(n>0)
   {
     fact=fact*n;
     n--;
   }
  System.out.print(fact);
}
}

--------------------------------------------------------------------------------------------
OUTPUT:
Enter tha n value:
10
The factorial of a given number is: 3628800