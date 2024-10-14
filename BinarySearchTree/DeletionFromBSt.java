// for deltion firstly we have to crete  create search and  then and then we can delete
public class DeletionFromBSt {
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
  public static Node delete(Node root,int val){
          if(root.data < val){
            root.right = delete(root.right, val);
          }else if(root.data > val){
            root.left = delete(root.left, val);
          }else{ //  voila :- Node which we want to delete  from Binary search Tree
                // Case:1-  leaf Node
                if(root.left == null && root.right ==  null){
                    return  null;
                }
                //case:2 -where we are dealing  with Single child
                if(root.left ==  null){
                         return root.right;
                }
                else if(root.right == null){
                return root.left;
                }
                //case:3- both chiildren are present

                Node IS =   findInorderSuccesor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);

          }
       return root;
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
         System.out.println();
         
        //  root =  delete(root, 1);
         root =  delete(root, 14);
         System.out.println();
         inorder(root);
     }
     
 }
 
