import java.util.*;
class Firstuniquechar
{
              public static void main(String args[ ])
             {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter the String: ");
                    String str=sc.next( );
                    char[ ] ch=str.toCharArray( );
                    firstuniq(str,ch);
              }
              public static void firstuniq(String str,char[ ] ch)
             {
                   Stack <Character> st= new Stack<Character> ( );
                   for(int i=0;i<ch.length;i++)
                   {
                      st.push(ch[i]);
                      if(st.get(i)==st.get(i+1))
                      {
                           st.remove(i);
                      }
                     else
                     System.out.println(st.get(i));
                   }
                   
                 
            }
}
------------------------------------------------------------------------------------------
OUTPUT:
Enter the String:
leetcode
ArrayIndexOutOfBounds                 