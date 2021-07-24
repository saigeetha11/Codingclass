import java.util.*;
class Stringconcatrev
{
            public static void main(String args[ ])
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the String1: ");
                String str=sc.nextLine( );
                System.out.println("Enter the String2: ");
                String str1=sc.nextLine( );
                String st=str.concat(str1);
                System.out.println("String after Concatenating: ");
                char ch[ ]=st.toCharArray( );
                String rev=" ";
                System.out.println("String after Reversing: ");
                for(int i=ch.length-1;i>=0;i--)
                {
                    rev+=ch[i];
               }
                    System.out.println(rev);
          }
}
----------------------------------------------------------------------------------------------
OUTPUT:
Enter the String1:
Welcome
Enter the String2:
Back
String after Concatenating:
WelcomeBack
String after Reversing:
kcaBemocleW