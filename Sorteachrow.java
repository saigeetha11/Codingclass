import java.util.*;
class Sorteachrow
{
   public static void main(String args[ ])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of Rows in a Matrix: ");
     int r=sc.nextInt( );
     System.out.println("Enter the number of Columns in a Matrix: ");
     int c=sc.nextInt( );
     int [ ][ ] a=new int[r][c];
     System.out.println("Enter the Elements in the Matrix: ");
     for(int i=0;i<r;i++)
     for(int j=0;j<c;j++)
     a[i][j]=sc.nextInt( );
    for(int i=0;i<r;i++)
    {
       int temp;
       for(int j=0;j<c;j++)
       { 
         for(int k=(j+1);k<c;k++)
          if(a[i][j]>a[i][k])
         {
           temp=a[i][j];
           a[i][j]=a[i][k];
           a[i][k]=temp;
         }
       }
    }
    System.out.println("The Sorted rows of Matrix: ");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
       System.out.print(a[i][j]+" ");
      }
      System.out.println( ); 
     }
  }
}
------------------------------------------------------------------------------------------
OUTPUT:
Enter the number of Rows in a Matrix: 
3
Enter the number of Columns in a Matrix: 
3
Enter the Elements in the Matrix:
1 3 2
5 1 6
9 11 4
The Sorted rows of Matrix:
1 2 3
1 5 6
4 9 11