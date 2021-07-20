import java.util.*;
class Hashmap
{
     public static void main(String args[ ])
     { 
         
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Size: ");
         int n=sc.nextInt( );
         int i;
         String[ ] keys=new String[n];
         int[ ] val=new int[n];
         System.out.println("Enter the keys: ");
         for(i=0;i<n;i++)
         keys[i]=sc.next( );
         System.out.println("Enter the values: ");
         for(i=0;i<n;i++)
         val[i]=sc.nextInt( );
         System.out.println("Enter the String to Search: ");
         String s=sc.next( );
         findval(n,keys,val,s);
      }
     public static void findval(int n,String keys[ ],int val[ ],String s)
     {
      HashMap<String,Integer> hm=new HashMap< >( );
      for(int i=0;i<n;i++)
      {  
       hm.put(keys[i],val[i]);
       {
         if(s==keys[i])
         {
          System.out.println(hm.get(keys[i]));
          break;
         }
        else
          System.out.println("not equal");
           break;
       }
     }
    }
}
--------------------------------------------------------------------------------------------------------
OUTPUT:
Enter the size:
5
Enter the keys:
hello
hi
huy
how
why
Enter the values:
11
12
13
14
15
Enter the String search:
hiii
not equal
              
