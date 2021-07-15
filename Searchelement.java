import java.util.*;
class Searchelement
{
   public static void main(String args[ ])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of the Array: ");
     int n=sc.nextInt( );
     int arr[ ]=new int[n];
     System.out.println("Enter the Array Elements: ");
     for(int i=0;i<n;i++)
     arr[i]=sc.nextInt( );
     System.out.println("Enter the Element to be searched: ");
     int s=sc.nextInt( );
     int found=0;
     for(int i=0;i<n;i++)
     {  
       if(arr[i]==s)
       {
         found=1;
         System.out.println("Element Found");
         break;
       }
     }
     if(found==0)
     {
       System.out.println("Element not Found");
     }
   }
}

------------------------------------------------------------------------------------------
OUTPUT:
Enter the size of the Array:
5
Enter the Array Elements:
10 11 40 41 54
Enter the Element to be searched:
47
Element not Found
     