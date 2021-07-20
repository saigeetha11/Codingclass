import java.util.*;
public class Stackarray1
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
              count+=1;
            }  
           if(a%2==0)
           {
             count1+=1;
           }
         }
          if(count==count1)
          System.out.println("Stack is Balanced");
          else
          System.out.println("Stack is not Balanced");
     }
}
-----------------------------------------------------------------------------------------
OUTPUT:
Enter the Size of the Array:
6
Enter the Elements in the Array:
1 2 4 3 6 7
Stack is Balanced