//gpt genreted
public class linkedlist5 {
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
    public static int size; // Java will initialize its value by default to 0

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

    public void print() { // O(n)
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

    public void add(int idx, int data) {
        // special case where we want to add data at 0th index means we want to add an
        // element at the head
        if (idx == 0) {
            addFirst(data);
            return;
        }
        // size++ after the base case because we don't want to add two times
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        // i = idx-1; temp->prev
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        // for a linked list that is empty
        if (size == 0) {
            System.out.println("Ll is empty");
            return Integer.MAX_VALUE;
        }
        // when head and tail will be at the same index
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        } else {
            //prev = i= size -2 because  n-1 is  Our Last  indices and n--2 will be our previosus of last element
            Node prev = head;
            for (int i = 0; i < size - 2; i++) {
                prev = prev.next;
            }
            int val = prev.next.data;// tail.data
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }
    }

    public static void main(String[] args) {
        linkedlist5 ll = new linkedlist5();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);

        ll.print(); // 1->2->3->4->5
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        System.out.println(linkedlist5.size);
    }
}
/* //mytyped
 //remove first 
public class linkedlist5 {
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
     public int removeFirst(){
        //for linked list is empty
        if(size==0){

             System.out.println("Ll is empty");
             return Integer.MAX_VALUE;
        }//when head and tail will be at same index
        else if(size ==1){
            int val=head.data;
             head=tail=null;
    size=0;
    size--;
             return val;
        }
        int val=head.data;
        head=head.next;
        return val;
     }
     public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        } else {
            Node prev = head;
            if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            for (int i = 0; i < size - 2; i++) {
                prev = prev.next;
            }
            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
            
        }
    }
    
  

 public static void main(String[] args) {
    linkedlist5 ll = new linkedlist5();

    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(4);
    ll.addLast(5);
    ll.add(2, 3);

    ll.print(); // 1->2->3->4->5
    ll.removeFirst();
    ll.print();
    ll.removeLast();
    System.out.println(ll.size);
}
 */