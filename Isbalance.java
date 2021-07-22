import java.util.*;
public class Isbalance
{
       public static void main(String args[ ])
       {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the String: ");
              String str=sc.nextLine( );
              boolean bal=isbalance(str);
              if(bal)
                   System.out.println("Balanced");
              else
                   System.out.println("Not Balanced");
         }

          public static boolean isbalance(String str)
         {
                if((str==null) || (str.length( )%2!=0))
                       return false;
                Stack<Character> st=new Stack<Character>( );
               for(int i=0;i<str.length( );i++)
               {
                      char ch=str.charAt(i);
                      if((ch=='(')||(ch=='[')||(ch=='{'))
                      st.push(ch);                     
                      else
                      {
                               if((ch==')')||(ch==']')||(ch=='}'))
                               {
                                  if(!st.isEmpty( ))
                                 {
                                       char lastele=st.pop( );
                                       if(lastele=='('&&ch!=')')
                                            return false;
                                       if(lastele=='['&&ch!=']')
                                             return false;
                                       if(lastele=='{'&&ch!='}')
                                             return false;
                                  }
                              } 
                                 else
                                 {
                                     return false;
                                 }
                      }
              }
               return st.isEmpty( );
         } 
          
}
-------------------------------------------------------------------------------------------------
OUTPUT:
Enter the String:
( ){ }[ ]
Balanced
Enter the String:
( { [ } ] )
Not Balanced
    