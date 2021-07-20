import java.util.*;
public class Stackarray
{ 
   static Stack<Integer> st=new Stack<Integer>( );
   public static void main(String args[ ])
   {
     
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Size of the Array: ");
     int n=sc.nextInt( );
     int[ ] arr=new int[n];
     System.out.println("Enter the Elements into the Array: ");
     for(int i=0;i<n;i++)
     arr[i]=sc.nextInt( );
     addele(arr,n);
     display( );
    }
    public static void addele(int arr[ ],int n)
    {
         for(int i=0;i<n;i++)
           st.push(arr[i]);
    }
    public static void display( )
    {
        System.out.println(st);
    }
}
---------------------------------------------------------------------------------------------------
OUTPUT:
Enter the Size of the Array:
5
Enter the Elements into the Array:
10 20 30 40 50
[10, 20, 30, 40, 50]