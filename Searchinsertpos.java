import java.util.*;
class Searchinsertpos
{
             public static void main(String args[ ])
            {
                 Scanner sc=new Scanner(System.in);
                 System.out.println("Enter the Size: ");
                 int n=sc.nextInt( );
                 int arr[ ]=new int[n];
                 System.out.println("Enter the Elements: ");
                for(int i=0;i<n;i++)
                arr[i]=sc.nextInt( );
                int m=arr.length;
                System.out.println("Enter the element to be inserted: ");
                int k=sc.nextInt( );
                System.out.println("Position of inserted element: ");
                int found=0,pos=-1;
                for(int i=0;i<n;i++)
                {
                    if(arr[i]>=k)
                    {
                       found=1;
                       pos=i;
                       System.out.println(pos);
                       break;
                   }  
               } 
             if(found==0)
             System.out.println(m); 
          }
}
--------------------------------------------------------------------------------------------------------------------
OUTPUT:
Enter the size:
4
Enter the Elements:
11 13 15 16
Enter the element to be inserted:
14
Position of inserted element:
2