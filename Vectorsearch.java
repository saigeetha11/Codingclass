import java.util.*;
class Vectorsearch
{
   public static void main(String args[ ])
  {
     Scanner sc=new Scanner(System.in);
     Vector<Integer> v=new Vector<Integer>( );
     System.out.println("Enter the size: ");
     int n=sc.nextInt( );
     System.out.println("Enter the elements: ");
     for(int i=0;i<n;i++)
     v.add(sc.nextInt( ));
     System.out.println(v);
     System.out.println("Enter the value to be Searched: ");
     int f=sc.nextInt( );
     System.out.println("Enter the number to be Replaced: ");
     int r=sc.nextInt( );
     if(v.contains(f))
     {
      int b=v.indexOf(f);
      v.set(b,r);
      System.out.println(v);
     }
     else
     {
      System.out.println("False");
     }
  }
}
---------------------------------------------------------------------------------------------
OUTPUT:
Enter the size: 
5
Enter the elements: 
11 22 33 44 55
Enter the value to be Searched:
22
Enter the number to be Replaced:
66
11 66 33 44 55
30
     
     