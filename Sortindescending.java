import java.util.*;
class Sortindescending
{
   public static void main(String args[ ])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the String: ");
     String str=sc.next( );
     char ch[ ]=str.toCharArray( );
     Arrays.sort(ch);
     String des=" ";
      for(int i=ch.length-1;i>=0;i--)
      {
        des+=ch[i];
      }
      System.out.println("String sorted in Descending order:  "+des);
    }
} 
-----------------------------------------------------------------------------
OUTPUT:
Enter the String:
geethakhanna
String sorted in Descending order:
tnnkhhgeeaaa