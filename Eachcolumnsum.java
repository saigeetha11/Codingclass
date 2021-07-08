import java.util.*;
class Eachcolumnsum
{
  public static void main(String args[ ])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the rows: ");
    int r=sc.nextInt( );
    System.out.println("Enter the columns: ");
    int c=sc.nextInt( );
    int [ ][ ] a=new int[r][c];
    System.out.println("Enter the array elements: ");
    for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
    a[i][j]=sc.nextInt( );
    for(int j=0;j<c;j++)
     {
       int sum=0; 
       for(int i=0;i<r;i++)
        {
           sum+=a[i][j];
        }
     System.out.println("Column "+(j+1)+" sum: "+sum);
    }
    
  }
}
-----------------------------------
OUTPUT:
Enter the rows:
3
Enter the columns:
4
Enter the array elements:
1 2 3 4
2 3 4 5
3 4 5 6
Column 1 sum:6
Column 2 sum:9
Column 3 sum:12
Column 4 sum:15
