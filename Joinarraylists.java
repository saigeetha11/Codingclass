import java.util.*;
class Joinarraylists
{
  public static void main(String args[ ])
  {
   ArrayList<Integer> a=new ArrayList<Integer>( );
   a.add(10);
   a.add(20);
   a.add(30);
   a.add(40);
  ArrayList<Integer> b=new ArrayList<Integer>( );
   b.add(100);
   b.add(200); 
   b.add(300);
   b.add(400);
   a.addAll(b);
   System.out.println("Joined ArrayLists: ");
   System.out.println(a);
  ArrayList<String> c=new ArrayList<String>( );
  c.add("red");
  c.add("blue");
  c.add("green");
  c.add("pink");
  ArrayList<String> d=new ArrayList<String>( ); 
  d.add("white");
  d.add("yellow");
  d.add("pink");
  c.addAll(d);
  System.out.println("Joined ArrayLists: ");
  System.out.println(d);
  }
}
--------------------------------------------------------------------------------------------------------
OUTPUT:
Joined ArrayLists:
[10, 20, 30, 40, 100, 200, 300, 400]
Joined ArrayLists:
[red, blue, green, pink, white, yellow, pink]