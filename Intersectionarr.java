import java.util.*;

class Intersectionarr

{

          public static void main(String args[])

         {

           Scanner sc=new Scanner(System.in);

           System.out.println("Enter the size: ");

           int m=sc.nextInt();

           int arr1[ ]=new int[m];

           System.out.println("Enter Elements : ");

           for(int i=0;i<m;i++)

          {

             arr1[i]=sc.nextInt();

          }

          System.out.println("Enter the size: ");

          int n=sc.nextInt();

          int arr2[]=new int[n];

          System.out.println("Enter array elements : ");

          for(int j=0;j<n;j++)

          {

            arr2[j]=sc.nextInt();

          }

         int arr3[ ]=new int[m+n];
         int count=0;
         for(int i=0;i<m;i++)
         {
               for(int j=0;j<n;j++)
              {
                  if(arr1[i]==arr2[j])
                  {
                      arr3[count]=arr1[i];
                      count++;
                  }
                 else 
                     continue;
              }
         }
         System.out.println("Intersection: ");
        for(int i=0;i<count;i++)
        {
                if(arr3[i]!=arr3[i+1])
               {
                System.out.println(arr3[i]);
               }
         }
      System.out.println(" ");
    }
}
--------------------------------------------------------------------------------------------------------------------------
OUTPUT:
Enter the size:
3
Enter the array elements:
[4,9,5]
Enter the size:
5
Enter the array elements:
[9,4,9,8,4]
Intersection:
9 4
           