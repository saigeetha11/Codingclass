import java.util.*;
import java.lang.*;
import java.io.*;
class Nextprime
{
        static int N=100005;
        public static int prime[ ]=new int[N];
        public static void sieve( )
        {
                for(int i=0;i<N;i++)
               {
                   prime[i]=i;
               }
                   prime[0]=1;
                   prime[1]=1;
                for(int i=2;i*i<N;i++)
                {
                    if(prime[i]==i)
                    {
                        for(int j=i*i;j<N;j+=i)
                        {
                            prime[j]=i;
                        }
                    }
                }
                  
           
         }
         public static void main(String args[ ]) throws java.lang.Exception
         {
                sieve( );
                int n;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the n value: ");
                 n=sc.nextInt( );
                for(int i=n;i<=N;i++)
               {
                  if(prime[i]==i)
                  {
                    System.out.println("Next prime is: "prime[i]);
                    break;
                  }
               }
         }
}
------------------------------------------------------------------------------------------------------------
Output:
Enter the n value:
52
Next prime is: 53