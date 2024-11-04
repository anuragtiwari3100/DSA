/**
 * LinkedList
 */
public class LinkedListEENtireCode {
     
    public  static class Node{
        int data;
        Node next;


        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node  head;
     public static Node tail;
public static int size;


     public void addFirst(int data){
        Node newNode  =  new Node(data); 
      size++;
        if(head ==null){
            head = tail = newNode;
            return;

        }
       
        newNode.next = head;
         head = newNode;

     }   

     public void addLast(int data ){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
        }
        tail.next= newNode;
        tail = newNode;
     }

   public void  print(){
    if(head == null){
        System.out.println("LL is empty......");
        return;
    }
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+"->"+" ");
        temp =  temp.next;
    }
    System.out.println("null");
   }

   public void add(int idx ,int data){

       if( idx == 0 ){
         addFirst(data);
         return;
       }

     Node newNode  = new Node(data);
     size++;
     Node temp = head;
      int i=0;

      while(i < idx-1){
        temp = temp.next;
        i++;
      }
       newNode.next = temp.next;
       temp.next = newNode;

   }

public int removeFirst(){
if(size == 0 ){
 System.out.println("The LinkdedList is empty...");
 return Integer.MIN_VALUE;
}else if(size  == 1){
  int val = head.data;
   head = tail = null;
   size=0;
   return val;
}
    int val = head.data;
    head = head.next;
    size--;
    return val ;
  
}
 

public int removeLast(){
    if(size ==0){
        System.out.println(" LL is emptty");
        return Integer.MIN_VALUE;

    }else if(size ==1){
          int val = head.data;
          head = tail =  null;
          size =0;
          return val;

    }
    //Prev : i = size -2;
    Node prev = head;
    for(int i=0; i<size-2; i++){
         prev = prev.next;
    }
  int  val = prev.next.data;
   prev.next = null;
   tail = prev ;
   size --;
   return val;
  
}


public int   iterativeSearch(int key){
    Node  temp =  head;
    int i=0;  

       while(temp != null){
        if(temp.data == key){
            return i;
        }
          temp = temp.next;
          i++;
       }
       return -1;
}
 
     public static void main(String[] args) {
    LinkedListEENtireCode ll = new LinkedListEENtireCode();
   
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(4);
    ll.addLast(5);
    ll.addLast(6);
    ll.addLast(7);
    ll.addLast(9);
    
    ll.add(0, 0);
    ll.print();
    System.out.println(ll.size);
    // ll.removeFirst();  
    ll.removeLast();
    ll.print();
    System.out.println(ll.size);
   System.out.println( ll.iterativeSearch(90));



  }
}







