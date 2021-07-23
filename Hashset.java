import java.util.*;
class Hashset
{
            public static void main(String args[ ])
            {
                    Scanner sc=new Scanner(System.in);
                    HashSet<Integer> h=new HashSet<Integer>( );
                    System.out.println("Enter the Size: ");
                    int n=sc.nextInt( );
                    System.out.println("Enter the elements: ");
                    for(int i=0;i<n;i++)
                    h.add(sc.nextInt( ));
                    System.out.println("Hashset is: ");
                    System.out.println(h);
                    Iterator itr=h.iterator( );
                    System.out.println("Display using iterator: ");
                    while(itr.hasNext( ))
                    {
                          Integer i=(Integer)itr.next( );
                          System.out.println(i);    
                    }    
              }
}
-------------------------------------------------------------------------------------------------------
OUTPUT:
Enter the Size:
5
Enter the Elements:
10 20 30 40 50 
Hashset:
[10, 20, 30, 40, 50]
Display using iterator:
50
20
40
10
30
