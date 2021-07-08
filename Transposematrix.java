import java.util.*;
class Transposematrix
{
public static void main(String args[ ])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the rows in matrix: ");
    int r=sc.nextInt( );
    System.out.println("Enter the columns in matrix: ");
    int c=sc.nextInt( );
    int [ ][ ] a=new int[r][c];
    System.out.println("Enter the elements in matrix: ");
    for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
    a[i][j]=sc.nextInt( );
    int [ ][ ] b=new int[c][r];
    for(int i=0;i<r;i++)
    {
     for(int j=0;j<c;j++)
     {
      b[j][i]=a[i][j];
     }
    }
   System.out.println("Transpose of a Matrix: ");
   for(int i=0;i<c;i++)
   {
    for(int j=0;j<r;j++)
    { 
     System.out.print(b[i][j]+" ");
    }
   System.out.println( );
   }
 }
}
----------------------------------------------------------------------
OUTPUT:
Enter the rows in matrix:
3
Enter the columns in matrix:
3
Enter the elements in matrix:
1 2 3
4 5 6
7 8 9
Transpose of a Matrix:
1 4 7
2 5 8
3 6 9
 