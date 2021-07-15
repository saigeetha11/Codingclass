import java.util.*;
class Joinarraylist
{
  public static void main(String args[ ])
  {
   Scanner sc=new Scanner(System.in);
   ArrayList<Integer> a=new ArrayList<Integer>( );
   System.out.println("Enter the n value: ");
   int n=sc.nextInt( );
   System.out.println("Enter the elements: ");
   for(int i=0;i<n;i++)
   a.add(sc.nextInt( ));
   ArrayList<Integer> b=new ArrayList<Integer>( );
   System.out.println("Enter the elements: ");
   for(int i=0;i<n;i++)
   b.add(sc.nextInt( ));
   a.addAll(b);
   System.out.println("Joined ArrayLists: ");
   System.out.println(a);
   System.out.println("Enter the m value: ");
   int m=sc.nextInt( );
   ArrayList<String> c=new ArrayList<String>( );
   System.out.println("Enter the Strings: ");
   for(int i=0;i<m;i++)
   c.add(sc.next( ));
   ArrayList<String> d=new ArrayList<String>( ); 
   System.out.println("Enter the Strings: ");
   for(int i=0;i<m;i++)
   d.add(sc.next( ));
   c.addAll(d);
   System.out.println("Joined ArrayLists: ");
   System.out.println(c);
  }
}
/*--------------------------------------------------------------------------------------------------------
OUTPUT:
Enter the n value:
5
Enter the elements:
10 20 30 40 
Enter the elements:
100 200 300 400
Joined ArrayLists:
[10, 20, 30, 40, 100, 200, 300, 400]
Enter the m value:
4
Enter the Strings:
red blue green pink
Enter the Strings:
white yellow black orange
Joined ArrayLists:
[red, blue, green, pink, white, yellow, black, orange]*/