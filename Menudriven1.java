import java.util.*;
class Menudriven1
{
   public static void main(String args[ ])
   {
     HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>( );
     Scanner sc=new Scanner(System.in);
        do
        {   
           System.out.println("*****************************");
           System.out.println("a.Add key x and value y");
           System.out.println("b.Print value of x");
           System.out.println("c.Size of the Hashmap");
           System.out.println("d.Removes value of key ");
           System.out.println("*****************************");
           System.out.println("Enter your Choice: ");
           String ch=sc.next( );
           switch(ch)
           {
             case "a":
                System.out.println("Enter the key x: ");
                int x=sc.nextInt( );
                System.out.println("Enter the value y: ");
                int y=sc.nextInt( );
                hm.put(x,y);
                break;
            case "b":
                System.out.println("Enter the key x: ");
                int x1=sc.nextInt( );
                if(hm.containsKey(x1))
                  System.out.println("value of key x is: "+hm.get(x1));
                else
                  System.out.println("-1");
                break;
            case "c":
                  System.out.println("Size of HashMap is: ");
                  System.out.println(hm.size( ));
                  break;
            case "d":
                  System.out.println("Enter the key x: ");
                  int x2=sc.nextInt( );
                  System.out.println("Remove value with key x is: ");
                  System.out.println(hm.remove(x2));
                  break;
           case "e":
                  System.exit(0);
           default:
                  System.out.println("Invalid Choice ");
                   break;
           }
        }while(true);
    
   }
}
---------------------------------------------------------------------------------------------------------------
OUTPUT:
****************************
a.Add key x and value y
b.Print value of x
c.Size of the Hashmap
d.Removes value of key 
****************************
Enter your Choice:
a
Enter the key x:
10
Enter the value  y:
20
Enter your Choice:
b
Enter the key x:
25
-1
Enter your Choice:
c
Size of HashMap is:
1
Enter your Choice:
d
Enter the Key x:
10
Removed value with key x is:
20
     
       