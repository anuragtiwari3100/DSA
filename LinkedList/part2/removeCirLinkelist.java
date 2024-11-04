package part2;
public class removeCirLinkelist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    // Methods -> addFirst(), addLast(), print()

    public void addFirst(int data) {
        // Step 1 => create a new node
        Node newNode = new Node(data);
        if (head == null) {
            // make newNode the head and also the tail
            head = tail = newNode;
            return;
        }

        // Step 2 => newNode next = head
        newNode.next = head; // linking to create a linked list
        // Step 3 => head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        // Step 1 => create a new node
        Node newNode = new Node(data);
        if (head == null) { // also tail == null by default if the head of a linked list is empty
                            // then and only then we consider the linked list as empty
            head = tail = newNode;
            return;
        }
        // point tail's next to newNode
        tail.next = newNode;
        // make newNode the tail also head
        tail = newNode;
    }

    public void print() {  //O(n)
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx, int data){
        //special case where we want to add data at 0th index means we want add element at head
        if(idx == 0){ 
            addFirst(data);
            return; 
        }
        Node newNode=new Node(data);
         Node temp=head;
         int i=0;
      //i =idx-1; temp->prev
         while(i < idx-1){
            temp=temp.next;
         i++;
         }
         newNode.next=temp.next;
         temp.next=newNode;
         
    }


       
    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
    
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    
        head = prev;
        // Update the tail if needed, assuming it is a doubly linked list
        // tail = curr; // Uncomment this line if your list has a 'tail' reference
    }
    
public void deletedNthFromEnd(int n ){
    // calculating size
    int sz=0;
    Node temp=head;
    while(temp !=null){
        temp=temp.next;
        sz++;
    }
    if(n==sz){
        head= head.next;// removeFromFirst
        return;
    }

    //sz-n
    int i=1;
    int iToFind=sz-n;
    Node prev=head;
    while(i< iToFind){
        prev= prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;
}
public  static boolean isCylcle(){//Such type of technique is known as Floyed  Cyclr finding Algorith(FCFA )
    Node slow=head;
    Node fast=head;
     while(fast !=null && fast.next !=null){
        slow=slow.next;//+1
        fast=fast.next.next;//+2
        if(slow==fast){
            return true;//cycle exist
        }
     }
     return  false; //cycle doesn't exist
}
public static void removeCycle(){
    //detect cycle
    Node slow=head;
    Node fast=head;
    boolean cycle=false;
    while(fast !=null && fast.next !=null){
        slow=slow.next;
        fast=fast.next.next; // fast should move two steps at a time
        if(fast==slow){
            cycle=true;
            break; 
        }
    }
    if(cycle==false){
        return;
    }
    //find meeting point
    slow=head;

    Node prev=null;//last Node
    while(slow !=fast){
        prev=fast;
        slow=slow.next;
        fast=fast.next;
    }

    //remove cycle=>last.next=null;
    prev.next=null;
}


    public static void main(String[] args){
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp; // 1->2->3->2, creating a cycle
        System.out.println("Is there a cycle? " + isCylcle());

        removeCycle();
        System.out.println("Is there a cycle? " + isCylcle()); 
        
}
}
 

