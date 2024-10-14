
    import java.util.ArrayList;
    import java.util.Scanner;
    public class Stack_using_LinkedList{
         static class Node{
            int data;//data
            Node next;//pointer
            Node(int data){ //constructor  in which we will pass the data
                this.data=data;
                this.next=null;
            }
         }
        static class Stack {
           static Node head=null; //head node
            
           //isEmpty()
           public static boolean isEmpty(){
             return head == null;
           }

      // push
      public static  void push(int data ){
        Node newNode = new Node(data);
        if(isEmpty()){
             head = newNode;
             return;
        }
          newNode.next = head;
           head = newNode ; //yaha problem hai hai  itnke diff me 
      }

      //pop
       public static int pop(){
        if(isEmpty()){
            return -1;
        }
          int top = head.data;
          head = head.next;
          return top;
       }
       //peek
         public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data; //return 
         }
        }
    
        public static void main(String[] args) {
            Stack s = new Stack();
         
          
            s.push(1);
            s.push(2);
            s.push(3);
    
            while (!s.isEmpty()) {
                System.out.println( ""+s.peek());
                s.pop();
            }
        }
    }
    
    // 15 min ll size