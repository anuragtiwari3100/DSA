import java.util.*;
public class Adding_at_Bootom {
    public static void pushAtbootom(Stack<Integer> s,int data){ // passing stack of  intiger and a data
      if(s.isEmpty()){
        s.push(data);
        return;
      }
        int top=s.pop();
       pushAtbootom(s, data);
       s.push(top);
    }

 public static void main(String[] args){
   Stack<Integer> s = new Stack<>();
   s.push(4);
   s.push(3);
   s.push(2);
   s.push(1);
   pushAtbootom(s,5);
   while (!s.isEmpty()) {   
     System.out.println(s.pop());    
   }
 }

}
