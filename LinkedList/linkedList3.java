//size operation
public class linkedList3 {
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
    public static int size;//java will initialize its value bydefault 0

    // Methods -> addFirst(), addLast(), print()

    public void addFirst(int data) {
        // Step 1 => create a new node
        Node newNode = new Node(data);
        size++;
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
        size++;
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
        //size++  after base case b/c we don't wan to add two times
        size++;
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

    public static void main(String[] args) {
        linkedList3 ll = new linkedList3();
       
        ll.addFirst(2);
     
        ll.addFirst(1);
     
        ll.addLast(4);
    
        ll.addLast(5);
        ll.add(2,3);
        ll.print();//1->2->3->4->5
        System.out.println(linkedList3.size);
    }
}


