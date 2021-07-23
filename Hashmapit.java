import java.util.*;
class Hashmapit
{
            public static void main(String args[ ])
            {
                    Scanner sc=new Scanner(System.in);
                    
                    System.out.println("Enter the Size: ");
                    int n=sc.nextInt( );
                    int a[ ]=new int[n];
                    System.out.println("Enter the Key elements: ");
                    for(int i=0;i<n;i++)
                    a[i]=sc.nextInt( );
                    int b[ ]=new int[n];
                    System.out.println("Enter the Value elements: ");
                    for(int i=0;i<n;i++)
                    b[i]=sc.nextInt( );
                    putval(n,a,b);
          }
          public static void putval(int n,int a[ ],int b[ ])
          {
               HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>( );
                   for(int i=0;i<n;i++)
                  {
                     hm.put(a[i],b[i]);
                   }
                 System.out.println(hm);
                 Iterator itr=hm.keySet( ).iterator( );
                 System.out.println("Display Keys using iterator: ");
                 while(itr.hasNext( ))
                {
                     Integer i=(Integer)itr.next( );
                    System.out.println(i);    
                }    
                 Iterator itr1=hm.values( ).iterator( );
                 System.out.println("Display Values using iterator: ");
                 while(itr1.hasNext( ))
                {
                     Integer j=(Integer)itr1.next( );
                    System.out.println(j);    
                }    
           }
}
----------------------------------------------------------------------------------------------------------
OUTPUT:
Enter the Size:
5
Enter the Key elements:
10 20 30 40 50 
Enter the Value elements:
11 12 13 14 15
{10=11, 20=12, 30=13, 40=14, 50=15}
Display Keys using iterator:
10
20
30
40
50
Display Values using iterator:
11
12
13
14
15
