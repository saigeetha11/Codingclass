import java.util.*;
public class Countwords
{
  public static void main(String args[ ])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the String: ");
   String str=sc.nextLine( );
   System.out.println("Total numer of words in String is: ");
   wordcount(str);
  }
static void wordcount(String str)
{
 int count=0;
 char ch[ ]=str.toCharArray( );
 for(int i=0;i<ch.length;i++)
 {
   if(((str.charAt(i)==' ') || (str.charAt(i)=='.'))&& str.charAt(i+1)!=' ')
   count++;
 }
int c=count+1;
System.out.println(c);
}
}
-------------------------------------------------------------------------------------------------
Enter the String:
Hello.How are you?
Total number of words in String is:
4
   