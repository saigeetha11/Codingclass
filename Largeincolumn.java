import java.util.*;
class Largeincolumn
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
    int len;
    for(int j=0;j<c;j++)
    {
      len=a[0][j];
      for(int i=0;i<r;i++)
      { 
       if(len<a[i][j])
        len=a[i][j];
      }
    System.out.println("Largest element in "+" Column "+(j+1)+" = "+len);
    }
  }
}
----------------------------------------------------------
OUTPUT:
Enter the rows:
3
Enter the columns:
4
Enter the array elements:
1    3   5  11
21 42  6   8
19 62 12 7
Largest element in Column 1=21
Largest element in Column 2=62
Largest element in Column 3=12
Largest element in Column 4=11

