//wnat to take Dynamic input
import java.util.ArrayList;
import java.util.Scanner;
public class Stack2 {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public  static int pop(){
          if(isEmpty()){
            return -1;
          }
            int top =list.get(list.size()-1);  
            list.remove(list.size()-1);
            return top;
         }
        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.print("Nothing TO print stack is empty!");
                return -1;
            }
            return list.get(list.size()-1); 
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements to push onto the stack: ");
        int n = sc.nextInt();
       for(int i=0; i<n; i++){
        System.out.print("Enter element " + (i + 1) + ": ");
         int elements = sc.nextInt();
        
       
       s.push(elements);
       }
       System.out.println("Values are in LIFO manner");

        while (!s.isEmpty()) {
            System.out.println( ""+s.peek());
            s.pop();
        }
    }
  
}
