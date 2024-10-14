import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class KthLevAncestors {

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

        

public static int  KthAncestors(Node root, int n , int k){
  if(root == null){
      return -1;
  }

  if(root.data == n){
    return 0;
  }
  
  int leftDist = KthAncestors(root.left, n, k);
  int rightDist = KthAncestors(root.right, n, k);

  int max = Math.max(leftDist,rightDist);
   if(max+1 == k){
    System.out.println(root.data+" ");
   }
   return  max+1;
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
    
          int n =7 , k=2;
          System.out.println("THe kth element which is at  node "+n+"is:");
          KthAncestors(root,n, k);          
            }
    }

}