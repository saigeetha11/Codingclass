import java.util.*;
class Menudriven
{
   public static void main(String args[ ])
   {
     LinkedList<Integer> l=new LinkedList<Integer>( );
     Scanner sc=new Scanner(System.in);
     System.out.println("1: Insert at Begining");
     System.out.println("2: Insert at Ending");
     System.out.println("3: Insert at Position");
     System.out.println("4: Delete at Begining");
     System.out.println("5: Delete at Ending");
     System.out.println("6: Delete at Position");
     System.out.println("7: Display");
     System.out.println("8: Exit");
     do
     {
      System.out.println("Enter your Choice: ");  
      int ch=sc.nextInt( );
      switch(ch)
      {
        case 1:
         System.out.println("Enter the element to be inserted at begining: ");
         int val=sc.nextInt( );
         l.addFirst(val);
         System.out.println(l); 
         break;
        case 2:
         System.out.println("Enter the element to be inserted at last: ");
         int val1=sc.nextInt( );
         l.addLast(val1);
         System.out.println(l);
         break;
        case 3:
         System.out.println("Enter the index number: ");
         int ind=sc.nextInt( );
         System.out.println("Enter the element to be added at position: ");
         int val2=sc.nextInt( );
         l.add(ind,val2); 
         System.out.println(l);
         break;
        case 4:
         System.out.println("the element deleted at begining: ");
         l.removeFirst( );
         System.out.println(l);
         break;
       case 5:
         System.out.println("The element deleted at last: ");
         l.removeLast( );
         System.out.println(l);
         break;
       case 6:
         System.out.println("Enter the position to be deleted at position: ");
         int ind1=sc.nextInt( );
         l.remove(ind1); 
         System.out.println(l);
         break;
       case 7:
        for(int i=0;i<l.size( );i++)
        System.out.println(l.get(i)+" ");
        break;
      case 8: 
        System.exit(0);
      default:
        System.out.println("Invalid choice");
        break;
      }
    }while(true);
  }
}
--------------------------------------------------------------------------------------------------------------------------
OUTPUT:
1: Insert at Begining
2: Insert at Ending
3: Insert at Position
4: Delete at Begining
5: Delete at Ending
6: Delete at Position
7: Display
8: Exit
Enter your choice:
1
Enter the element to be inserted at begining:
10
[10]
Enter your choice:
2
Enter the element to be inserted at last:
25
[10, 25]
Enter your choice:
3
Enter the index:
0
Enter the element to be inserted at position:
36
[36, 10, 25]
Enter your choice:
6
Enter the position to be deleted:
1
[36, 25]
Enter your choice:
3
Enter the index:
1
Enter the element to be inserted at positon:
42
[36, 42, 25]
Enter your choice:
7
36, 42, 25


     