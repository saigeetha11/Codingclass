import java.util.*;
class Dupfrequencies
{
  public static void main(String args[ ])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size: ");
   int n=sc.nextInt( );
   System.out.println("Enter the elements: ");
   int[ ] arr=new int[n];
   for(int i=0;i<n;i++)
   arr[i]=sc.nextInt( );
   dupfreq(arr,n);
   }
public static void dupfreq(int arr[ ],int n)
{
  HashMap<Integer,Integer> hm=new HashMap<>( );
  for(int i=0;i<n;i++)
  {
    if(hm.containsKey(arr[i]))
    {
      hm.put(arr[i],hm.get(arr[i])+1);
    }
    else
    {
      hm.put(arr[i],1);
     }
   }
  for(int i=0;i<n;i++)
  {
     if(hm.get(arr[i])==1)
     {
       hm.remove(arr[i]);
     }
  }
System.out.println(hm);
}
}
--------------------------------------------------------------------------------------
OUTPUT:
Enter the size:
10
Enter the elements:
10 20 30 20 40 50 30 50 60 70
{20=2, 50=2, 30=2}
