import java.util.*;
public class Primenumber
{
    public static void main(String args[ ])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the n value: ");
      int n=sc.nextInt( );
      System.out.println("The prime numbers b/w 1 to n are: ");
      prime(n);
    }
static void prime(int n)
{
   int count=0;
   for(int i=1;i<=n;i++)
   {
     count=0;
     for(int j=1;j<=i;j++)
     {
      if(i%j==0)
      {  
        count++;
      }
     }
      if(count==2)
      {
        System.out.print(i+" ");
      }
   }
}
}
    
---------------------------------------------------------------------------------------------------------------------------------
Enter the n value:
25
The prime numbers b/w 1 to n are: 
2 3 5 7 11 13 17 19 23
