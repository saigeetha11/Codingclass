import java.util.*;
class Swapmatrix
{
   public static void main(String args[ ])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of Rows in a Matrix: ");
     int r=sc.nextInt( );
     System.out.println("Enter the number of Columns in a Matrix: ");
     int c=sc.nextInt( );
     int [ ][ ] a=new int[r][c];
     int [ ][ ] b=new int[r][c];
     System.out.println("Enter the Elements in First Matrix: ");
     for(int i=0;i<r;i++)
     {
        for(int j=0;j<c;j++)
        {
          a[i][j]=sc.nextInt( );
        }
     }
     System.out.println("Enter the Elements in Second Matrix: ");
     for(int i=0;i<r;i++)
     {
        for(int j=0;j<c;j++)
        {
          b[i][j]=sc.nextInt( );
        }
     }
     for(int i=0;i<r;i++)
     { 
       int temp;
       for(int j=0;j<c;j++)
       {
        temp=a[i][j];
        a[i][j]=b[i][j];
        b[i][j]=temp;
       }
     }
     System.out.println("After swapping First matrix is: ");
     for(int i=0;i<r;i++)
     {
       for(int j=0;j<c;j++)
       {
        System.out.print(a[i][j]+" ");
       }
       System.out.println( );
     }
       System.out.println("After swapping Second matrix is: ");
     for(int i=0;i<r;i++)
     {
       for(int j=0;j<c;j++)
       {
        System.out.print(b[i][j]+" ");
       }
       System.out.println( );
     } 
  }
}
-----------------------------------------------------------------------------------------------------------
OUTPUT:
Enter the number of Rows in a Matrix: 
3
Enter the number of Columns in a Matrix: 
3
Enter the Elements in First Matrix:
1 2 3
4 5 6
7 8 9
Enter the Elements in Second Matrix:  
11 12 13
14 15 16
17 18 19
After swapping First matrix is: 
11 12 13
14 15 16
17 18 19  
After swapping Second matrix is:
1 2 3
4 5 6
7 8 9