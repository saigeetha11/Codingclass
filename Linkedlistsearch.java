import java.util.*;
class Linkedlistsearch
{
    public static void main(String args[ ])
   {
     Scanner sc=new Scanner(System.in);
     LinkedList<Integer> l=new LinkedList<Integer>( );
     System.out.println("Enter the size: ");
     int n=sc.nextInt( );
     System.out.println("Enter the elements: ");
     for(int i=0;i<n;i++)
     l.add(sc.nextInt( ));
     System.out.println(l);
     System.out.println("Enter the value to be Searched: ");
     int f=sc.nextInt( );
     if(l.contains(f))
     {
      int b=l.indexOf(f);
      l.remove(b);
      System.out.println(l);
     }
    else
    {
    System.out.println("Element not Found");
    }

   }
}
-------------------------------------------------------------------------------------------------------
OUTPUT:
Enter the size: 
5
Enter the elements: 
10 20 30 40 50
Enter the value to be Searched:
30
10 20 40 50
