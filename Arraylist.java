import java.util.*;
class Arraylist
{
           public static void main(String args[ ])
          {
                Scanner sc=new Scanner(System.in);
                ArrayList <Integer> a=new ArrayList<Integer>( );
                System.out.println("Enter the Size: ");
                int n=sc.nextInt( );
                System.out.println("Enter the elements: ");
                for(int i=0;i<n;i++)
                a.add(sc.nextInt( ));
                System.out.println("Arraylist: ");
                System.out.println(a);
                System.out.println("Display using iterator: ");
                Iterator itr=a.iterator( );
                while(itr.hasNext( ))
                {
                     Integer i=(Integer)itr.next( );
                     System.out.println(i);
                 }
    
          }
}
---------------------------------------------------------------------------------------------
OUTPUT:
Enter the Size:
5
Enter the elements:
11 12 13 14 15
Arraylist:
[11, 12, 13, 14, 15]
Display using iterator:
11
12
13
14
15

                