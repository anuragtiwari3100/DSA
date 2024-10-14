//summ of nodes at kth level  and Bootom view Home work
import java.util.*;
public class TopView {
        static class  Classroom{
            static class Node{
            int data;
            Node left;
            Node right;
             public Node(int data){
                this.data =  data ;
                this.left = null; 
                this.right = null;
             }
            }
            public static int sum(Node root){
                if(root == null){
                    return 0;
                }
                int leftSum = sum(root.left);
                int rightSum =  sum(root.right);
                return leftSum + rightSum + root.data;
            }
            static class Info{
                Node node;
                int hd;

                 public Info(Node node , int hd){
                    this.node = node;
                    this.hd = hd;
                 }

            }
            public static void topView(Node root) {
                Queue<Info> q = new LinkedList<>();
                HashMap<Integer, Node> map = new HashMap<>();
                int min = 0, max = 0;
                q.add(new Info(root, 0));
            
                while (!q.isEmpty()) {
                    Info curr = q.poll(); // Use poll instead of remove for safety
            
                    if (curr != null) {
                        if (!map.containsKey(curr.hd)) {
                            map.put(curr.hd, curr.node);
                        }
            
                        min = Math.min(min, curr.hd);
                        max = Math.max(max, curr.hd);
            
                        if (curr.node.left != null) {
                            q.add(new Info(curr.node.left, curr.hd - 1));
                        }
                        if (curr.node.right != null) {
                            q.add(new Info(curr.node.right, curr.hd + 1));
                        }
                    }
                }
            
                // Print the top view after processing all nodes
                for (int i = min; i <= max; i++) {
                    if (map.containsKey(i) && map.get(i) != null) {
                        System.out.print(map.get(i).data + " ");
                    }
                }
                System.out.println();
            }
            
            
        
            public static void main(String[] args) {
                /*
                               1
                              / \
                             2   3 
                            / \ /\
                           4  5 6 7
                 */
                Node root = new Node(1);
                root.left = new Node(2);
                root.right = new Node(3);
                root.left.left = new Node(4);  // Fixed: used root.left.left instead of root.left.right
                root.left.right = new Node(5); // Fixed: used root.left.right instead of root.left.left
                root.right.left = new Node(6);
                root.right.right = new Node(7);
            
                /*
                               2
                              / \ 
                             4   5 
                 */
                Node subRoot = new Node(2);
                subRoot.left = new Node(4);
                subRoot.right = new Node(5);
                topView(root);
            }
        
    }
    }


    
