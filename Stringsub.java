import java.util.*;
public class Stringsub
{
  public static void main(String args[ ])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String: ");
    String str=sc.nextLine( );
    System.out.println("Enter the String 2: ");
    String str1=sc.nextLine( );
    boolean res= substrings(str,str1); 
    System.out.println("The result is: ");
    System.out.println(res);
   }
static boolean substrings(String str,String str1)
{
boolean res=false;
res=str.contains(str1);
return res;
}
}
---------------------------------------------------------------------------------------
OUTPUT:
Enter the String:
mathematics
Enter the String:
the
The result is:
true