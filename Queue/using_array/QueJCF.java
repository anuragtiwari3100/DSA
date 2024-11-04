import java.util.*;
public class QueJCF {            
           public  static void main(String[] args){
           
            // Queue<Integer> q = new LinkedList<>();//b/c Queue is  an interface it is interface  so we can't create its classes  we can implement it by using two classes first one is LinkedLust and other one is array 
            Queue<Integer> q = new ArrayDeque<>();   
            q.add(1);
               q.add(2);
               q.add(3);
    
               while(!q.isEmpty()){
                   System.out.println(q.peek());
                   q.remove();
               }
       
       
           }
           
       }
    
       
       
        
