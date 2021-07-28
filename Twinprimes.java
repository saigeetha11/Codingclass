import java.util.*;
import java.io.*;
public class Twinprimes
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
  
   
    public static void main(String args[]) throws IOException
    {
                sieve( );
                int s,n,count=0;
                Scanner sc=new Scanner(System.in);
                System.out.println("Start: ");
                s=sc.nextInt( );
                System.out.println("End: ");
                n=sc.nextInt( );
                System.out.println("Total Twin primes: ");
                for(int i=s;i<=n;i++)
                {
                  if(prime[i]==1&&prime[i+2]==1)
                    {
                         count+=1;
                     }
                }
               System.out.println(count);
        
    }
}
---------------------------------------------------------------------------------------------------------------------------------
Output:
Start:
2
End:
20
Total Twin primes:
4
