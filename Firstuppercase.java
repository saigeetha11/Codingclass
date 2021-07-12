import java.util.*;
class Firstuppercase
{
   public static void main(String args[ ])
   {
    Scanner sc=new Scanner(System.in);  
    System.out.println("Enter the String: ");
    String str=sc.nextLine( );
    str=" "+str;
    String s=" ";
    for(int i=0;i<str.length( );i++)
    {
     char ch=str.charAt(i);
     if(ch==' ')
     {
       s=s+ch;  
       i++;
       ch=str.charAt(i);
       s=s+Character.toUpperCase(ch);
     }
     else
     {
      s=s+ch;
      }
    }
    s=s.trim( );
    System.out.println("The arranged String is: "+s);
   }
}

--------------------------------------------------------------------------------------
OUTPUT:
Enter the String:
these are the assignments
The arranged String is:
These Are The Assignments
