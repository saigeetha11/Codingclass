import java.util.*;
public class Stackarray2
{
     static Stack<Integer> st=new Stack<Integer>( );
    public static void main(String args[ ])
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the size of the Array: ");
          int n=sc.nextInt( );
          int[ ] arr=new int[n];
          System.out.println("Enter the Elements into the Array: ");
         for(int i=0;i<n;i++)
         arr[i]=sc.nextInt( );
         addele(arr,n);
    }
      public static void addele(int arr[ ],int n)
     {      
           int count=0,count1=0;
           for(int i=0;i<n;i++)
           {
            st.push(arr[i]);
            int a=st.get(i);
            if(a%2==1)
           {
            st.remove(a);
           }
          else
            st.get(i);
           }
         System.out.println(st);
     }
}
--------------------------------------------------------------------------------------------------------
OUTPUT:
Enter the Size of the Array:
5
Enter the Elements in the Array:
1 3 4 5 8
4 8