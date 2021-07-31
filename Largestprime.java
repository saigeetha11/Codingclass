import java.util.*;

public class Largestprime
{
    
    static int N=100005;

    static boolean prime[]=new boolean[N+1];

    static void sieve(int n)

    {

        for(int i=0;i<=N;i++)

        {

            prime[i]=true;

        }

        prime[0]=false;
 
        prime[1]=false;

        for(int i=2;i*i<=N;i++)

        {

            if(prime[i]==true)

            {

                for(int j=i*i;j<=N;j+=i)

               {

                   prime[j]=false;

               }

            }

        }

    }

    public static void main(String args[])
 
    {

       
        int n,max;

        Scanner sc=new Scanner(System.in);

        max=Integer.MIN_VALUE;
 
       System.out.println("Enter the n value: ");

        n=sc.nextInt();

        int a[]=new int[n];

        sieve(n);

        System.out.println("Enter the array elements: ");

        for(int i=0;i<n;i++)

        {

          a[i]=sc.nextInt();

        }
 
         System.out.print("Largest prime is: ");

         for(int i=0;i<n;i++)

        {

            if(prime[a[i]]==true)

            {

               if(a[i]>max)

               {

                 max=a[i];
  
             }

           }
 
        }
 
         System.out.println(max);

    }

}
------------------------------------------------------------------------------------------------------------------
Output:
Enter the n value:
5
Enter the array elements:
11 12 15 82 61
Largest prime is:
11