import java.util.*;
public class Reversestring
{
   public static void main(String args[ ])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the String: ");
      String str=sc.nextLine( );
      char ch[ ]=str.toCharArray( );
      String reverse="";
      for(int i=ch.length-1;i>=0;i--)
      {
        reverse+=ch[i];
      }
      System.out.println("Reverse of String is: "+reverse);
   }
}
------------------------------------------------------------------------------------------
OUTPUT:
Enter the String:
Assignment program
Reverse of String is:
margorp tnemngissA