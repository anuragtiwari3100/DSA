import java.util.*;
public class RootToLeaf {
        static class Node{
         int data;
         Node left;
         Node right;
    
           Node(int data){
             this.data = data ;
    
           }
        }
        public static Node   insert(Node root,int  val){
         if(root == null){
             root = new Node(val);
             return root;
         }
         if(root.data > val) {
              // left subtree
              root.left = insert(root.left, val); 
         }else{
             //right subtree
             root.right = insert(root.right, val);
         }
         return root;
        }
        public  static void inorder(Node root){
         if(root ==  null){
             return;
         }
         inorder(root.left);
         System.out.print(root.data+" ");
         inorder(root.right);
        }
    public static boolean Search(Node root,  int key){//O(H)
    if(root == null){
        return false;
    }
    if(root.data == key){
        return true;
    }
    if(root.data > key){
        return Search(root.left,key); 
    }
     else{
        return Search(root.left, key);
     }
    }
  
    public static void printpath( ArrayList<Integer> path ){
           for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
           }
           System.out.println("Null");
    }
    public static void   printRootToleafPath(Node root, ArrayList<Integer> path){
      if(root  == null){
        return;
      }
      path.add(root.data);
      if(root.left == null  && root.right ==  null){
         printpath(path);
      }
      printRootToleafPath(root.left,path);
      printRootToleafPath(root.right,path);
      path.remove(path.size()-1);

    }

      public static Node findInorderSuccesor(Node root){
        while (root.left != null) {
           root =  root.left;            
        }
        return root;
      }

     public static void   main(String[] args){
         int values[] = {8,5,3,1,4,6,10,11,14};
         Node root = null;
         for(int i=0; i<values.length; i++){
             root = insert(root, values[i]);
         }
        
         inorder(root);

         printRootToleafPath(root,new ArrayList<>());
     }
}
     
    
    
    
