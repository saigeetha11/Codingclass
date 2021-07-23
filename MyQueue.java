import java.util.*;
public class MyQueue 
{  
        Stack<Integer> st1=new Stack<Integer>();
        Stack<Integer> st2=new Stack<Integer>();
        
    public void push(int x) 
    {
       st1.push(x); 
        
    }
    public int pop() {
        if(st2.empty())
        {
            while(!st1.isEmpty( ))
            {
              st2.push(st1.pop());  
            }
            return st2.pop();
        } 
    public int peek() 
    {
        if(st2.isEmpty())
        {
            while(!st1.isEmpty())
            {
                st2.push(st1.pop());
            
            }
            return st2.peek();
        }
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() 
   {
        return st1.isEmpty( )&& st2.isEmpty();
        
    }
}
------------------------------------------------------------------------------------------------------------------------
Output:
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[ ], [1], [2], [ ], [ ], [ ]]
[null, null, null, 1, 1, false]