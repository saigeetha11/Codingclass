import java.util.*;
public class Evenoddinno
{  
public static void main(String args[])
{  
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements: ");  
int n=sc.nextInt( );
int a[ ]=new int[n];
System.out.println("Enter the elements: "); 
for(int i=0;i<n;i++)
{ 
 a[i]=sc.nextInt( );
}
for(int i=0;i<a.length;i++)
{  
 if(a[i]%2==1)
{  
System.out.println("Odd= "+a[i]);  
}  
}   
for(int i=0;i<a.length;i++)
{  
if(a[i]%2==0)
{  
System.out.println("Even="+a[i]);  
}  
}  
}
} 