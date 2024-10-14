package part2;

public class DoublyLL {
    public class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    // add
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        newNode.prev = null; // Corrected line
        head.prev = newNode;
        head = newNode;
    }

    // print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // remove-remove last
    public int removeLast(){
        if(head == null){
            System.out.println("DLL is empty");
          return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head =tail = null;
            size --;
            return val;
        }
        int val = head.data;
          head= head.next;
          head.prev =null;
          size --;
          return val;
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println("Size: " + dll.size);
        dll.removeLast();
        dll.print();
        System.out.println("Size: " + dll.size);   
     }
}
//hw addfirst and remove first
