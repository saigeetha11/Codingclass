import java.util.*;
class Duplicateelements
{
    public static void main(String args[ ])
    {
      Scanner sc=new Scanner(System.in);
      HashSet<Integer> h=new HashSet<Integer>( );
      System.out.println("Enter the size: ");
      int n=sc.nextInt( );
      int[ ] a=new int[n];
      System.out.println("Enter the elements: ");
      for(int i=0;i<n;i++)
      a[i]=sc.nextInt( );
     for(int i=0;i<a.length;i++)
     {
       for(int j=1;j<a.length;j++)
       {
         if(a[i]==a[j] && i!=j)
         {
           h.add(a[i]);
           break;
         }
       }
     }
     System.out.println(h);
  }
}
-------------------------------------------------------------------------
OUTPUT:
Enter the size:
5
Enter the elements:
10 20 30 30 10 
[10, 30]      