import java.util.*;
import java.lang.*;
import java.io.*;
class Uglynumber
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
                  int pos,count=0,k=0,x;
                  Scanner sc=new Scanner(System.in);
                  System.out.println("Enter the x value");
                  int n=sc.nextInt( );
                  int arr[ ]=new int[n];
                  int arr1[ ]=new int[n];
                  while(n!=1)
                  {
                        x=prime[n];
                        arr[k]=x;
                        if(arr[k]<=5)
                        k++;
                        n=n/prime[n];        
                 }
                      if(arr[k]<=5)
                      System.out.println("True");
                     else
                      System.out.println("False");
         }
}
/*-------------------------------------------------------------------------------------------------------------------------------
Output:
Enter the x value:
15
True
Enter the x value:
14
False*/