import java.util.*;
import java.lang.*;
import java.io.*;
class Primereverse
{
            static int N=200000;
            public static int prime[ ]=new int[N];
            public static int arr[ ]=new int[N];
            public static void sieve( )
            {
                for(int i=0;i<N;i++)
                {
                   prime[i]=1;
                }
                 prime[0]=0;
                 prime[1]=0;
                 for(int i=2;i*i<N;i++)
                {
                      if(prime[i]==1)
                      {
                         for(int j=i*i;j<N;j+=i)
                         {
                             prime[j]=0;
                         }
                      }
                }
         }
         public static void main(String args[ ]) throws java.lang.Exception
         {
                sieve( );
                int s,n;
                Scanner sc=new Scanner(System.in);
                System.out.println("Start: ");
                s=sc.nextInt( );
                System.out.println("End: ");
                n=sc.nextInt( );
                System.out.println("Prime numbers: ");
                for(int i=n;i>=s;i--)
                       if(prime[i]==1)
                         System.out.println(i);
          }
}
-----------------------------------------------------------------------------------------------------------
Output:
Start:
2
End:
13
Prime Numbers:
11 7 5 3 2