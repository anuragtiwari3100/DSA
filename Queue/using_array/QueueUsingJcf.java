import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingJcf {
 
    public static void main(String[] args) {
         
// Queue<Integer> q = new LinkedList<>();
Queue<Integer> q = new  ArrayDeque<>();
q.add(0);
q.add(1);
q.add(2);
q.add(3);


while(!q.isEmpty()){
    System.out.println(q.peek());
 q.remove();
}
    }
    
}
//Note Queue is an interface in java so we can insttiate its objects it can be done in java using 2  classes 1 LinkedList 2 ArrayDequw
