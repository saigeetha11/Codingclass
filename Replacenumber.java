import java.io.*;

import java.util.*;


public class Replacenumber
 
{
    
public static void main(String[] args)
  
  {
        
Scanner sc = new Scanner(System.in);
        
       
 int n, x, y, s = 0, c = 1, r = 0;

       
 System.out.println("Enter a number");
    
 n = sc.nextInt();
       
 System.out.println("Enter x ");

 x = sc.nextInt();
 
 System.out.println("Enter y ");
       
 y = sc.nextInt();

      
 while(n != 0){
            
 r = n%10;
            
if(r == x)
{
               
 r = y;
         
}           
 s = r * c + s;
           
 c = c* 10;
           
 n = n/10;
      
}

       
 System.out.print("Replaced number= " +s);
    
}
}