public class SearchingABst {
  
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
     public static void   main(String[] args){
         int values[] = {5,1,3,4,2,7};
         Node root = null;
         for(int i=0; i<values.length; i++){
             root = insert(root, values[i]);
         }
         System.out.println();
         inorder(root);
         System.out.println();
         if(Search(root, 1)){
            System.out.println("found entered key is present in BST");
         }else{
            System.out.println("data not found");
         }
     }
     
 }
 
