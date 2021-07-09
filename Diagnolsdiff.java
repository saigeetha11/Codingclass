import java.util.*;
class Diagnolsdiff
{
   public static void main(String args[ ])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the rows in the Matrix: ");
     int r=sc.nextInt( );
     System.out.println("Enter the columns in the Matrix: ");
     int c=sc.nextInt( );
     int [ ][ ]a=new int[r][c];
     System.out.println("Enter the Elements in the Matrix: ");
     for(int i=0;i<r;i++)
     for(int j=0;j<c;j++)
     a[i][j]=sc.nextInt( );
     System.out.print("Sum of Diagonal is: ");
     int sum=0;
     for(int i=0,j=0;i<r;i++,j++)
     { 
       sum+=a[i][j];
     }
     System.out.println(sum);
     int sum1=0;
     System.out.print("Sum of Anti-Diagonal is: ");
     for(int i=0,j=c-1;i<r;i++,j--)
     { 
       sum1+=a[i][j];
     }
     System.out.println(sum1);
     int diff=sum-sum1;
     System.out.print("Difference of Diagnol and Anti-diagnol is: "+diff);
   }
}
-------------------------------------------------------------------------------------------
OUTPUT:
Enter the Rows in the Matrix: 
3
Enter the columns in the Matrix:
3
Enter the Elements in the Matrix: 
4     5     6
19  22   34
16   2     5
Sum of Diagonal is: 31
Sum of Anti-Diagonal is: 44
Difference of Diagnol and Anti-diagnol is: -13
