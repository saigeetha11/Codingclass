import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        int n,r,s=0,p=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value: ");
        n=sc.nextInt( );
        while(n!=0)
        {
            r=n%10;
            s=s+r;
            p=p+r;
            n=n/10;
        }
        System.out.println(+s);
        System.out.println(+p);
    }
}