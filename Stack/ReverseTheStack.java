import java.util.*;
public class ReverseTheStack {
    public static void pushAtBotton(Stack<Integer> s ,int data){
         if(s.isEmpty()){
            s.push(data);
             return;
         }
         int top = s.pop();
         pushAtBotton(s,data);
         s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBotton(s,top);
         
    }

       public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args){
      
            Stack<Integer> s = new Stack<>();
            s.push(1);
            s.push(2);
            s.push(3);
            // Stack is now 3, 2, 1
            reverseStack(s);
            // After reversing, stack should be 1, 2, 3
            printStack(s); // This will print 1, 2, 3
        }
        
    }
