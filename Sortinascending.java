import java.util.*;
class Sortinascending
{
     public static void main(String args[ ])
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String: ");
       String str=sc.nextLine( );
       char ch[ ]=str.toCharArray( );
       Arrays.sort(ch);
       String str1=new String(ch);
       System.out.println("String sorted in Ascending order is: "+str1);
     }
}

----------------------------------------------------------------------------------------------
OUTPUT:
Enter the String:
geethakhanna
String sorted in Ascending order is: aaaeeghhknnt