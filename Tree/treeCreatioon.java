
public class treeCreatioon {
    

  
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
    
            public static void printPreOrder(Node root) {
                if (root != null) {
                    System.out.print(root.data + " ");
                    printPreOrder(root.left);
                    printPreOrder(root.right);
                }
            }
                      public static void printInOrder(Node root) {
                   if (root != null) {
                       printInOrder(root.left);
                       System.out.print(root.data + " ");
                       printInOrder(root.right);
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
    
                System.out.println("Pre-order traversal of the tree:");
                printPreOrder(root);
                System.out.println("In-order traversal of the tree:");
                printInOrder(root);
            }
        }
    }
    
         
