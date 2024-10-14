public class LinkkedList1 {
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

    public static void main(String[] args) {
        LinkkedList1 ll = new LinkkedList1();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}
