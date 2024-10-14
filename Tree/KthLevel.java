import java.util.LinkedList;
import java.util.Queue;

public class KthLevel {
    static class Classroom {
        static class Node {
            int data;
            Node left;
            Node right;

            public Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }

        // public static void printPreOrder(Node root) {
        //     if (root != null) {
        //         System.out.print(root.data + " ");
        //         printPreOrder(root.left);
        //         printPreOrder(root.right);
        //     }
        // }



        //           public static void printInOrder(Node root) {
        //        if (root != null) {
        //            printInOrder(root.left);
        //            System.out.print(root.data + " ");
        //            printInOrder(root.right);
        //        }
        //    }


//Using Reccursions
           public static void KLevel(Node root, int level, int k){
            if(root == null){
                return;
            }
            if(level == k){
                System.out.println(root.data+ " ");
                return;
            }
            KLevel(root.left, level+1, k);
            KLevel(root.right, level+1, k);
        }



        //Using Iterion
 public static void KthLevel(Node  root, int k){
       if(root == null){
        return;
       }

       Queue<Node>  q =  new LinkedList<>();
         q.add(root);
       int currLevel= 1;
       while(!q.isEmpty()){
        int size = q.size();

        if(currLevel == k){
            for(int i=0; i<size; i++){
              Node head = q.poll();
              System.out.println(head.data+" ");
            }
            System.out.println();
            return;
        }
             for(int i=0; i<size; i++){
                Node head = q.poll();
                if(head.left != null){
                    q.add(head.left);
                }
                if(head.right  != null){
                    q.add(head.right);
                }

             }
             currLevel++;
       }
 }

        

        public static void main(String[] args) {
            /*
                               1
                              / \
                              2  3
                             / \ /\
                            4  5 6 7
             */ 
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);

         int lv=1;

            int k=3;
            KLevel(root ,1,k);
            System.out.println("nmdoiwhvo");
            KthLevel(root,k);
            //level:here level is current level of the tree
            // and k: is desired or say to target level
        }
    }
}

     