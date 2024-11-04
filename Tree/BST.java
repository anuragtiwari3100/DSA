import java.util.ArrayList;

public class BST{

    static class Node {
        int data ;
        Node left;
        Node right;

        Node(int data){
            this.data =  data;
            this.left = null;
            this.right =  null;

        }

    }

    public static Node insert(Node root, int val){
          if(root == null){
            root  = new Node(val);
            return root;

          }

           if(root.data > val){
           root.left= insert(root.left, val);
           }
           else{
            root.right =  insert(root.right, val);
           }
           return root;
    }



 public static  void  inorder(Node root){
    if(root == null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
 }


public static  void  preOrder(Node root){
    if(root == null){
        return;
    }
    System.out.print(root.data+" ");
    preOrder(root.left);
    preOrder(root.right);

}

 
public static void  postOrder(Node root){
      if(root == null){
       return;
      }

       preOrder(root.left);
       preOrder(root.right);
       System.out.print(root.data+ "  ");
}


//Doubt  =>. 
public static  Node   DeleteNode(Node root , int val){
      if( root.data > val){
       root.left= DeleteNode(root.left, val);
      }
       else if( root.data < val){
        root.right = DeleteNode(root.right, val);
       }
        else{  // root .data == val
            // case.1
             if( root.left == null && root.right == null){
                 return  null;
             }

             //case.2
          else   if(root.left == null){
                 return  root.right;
             }
           //case.3
  Node IS = inorderSuccessor(root.right);
  root.data = IS.data;
   root.right = DeleteNode(root.right,IS.data); 
        }
        return root;
}
public  static  Node inorderSuccessor(Node root){
    while(root.left != null){
          root =  root.left;
    }
    return root;

}


public static   boolean SearchKey(Node root, int key){
    if(root == null){
         return false;
    }
    if(root.data > key){
        return SearchKey(root.left,key);
    }

    else if(root.data  == key){
        return true;
    }
    else{
        return SearchKey(root.right, key);
    }
}


public static  void printInRange(Node root , int X, int Y){
    if(root == null){
        return;
    }
    if(root.data >= X && root.data <= Y){
        printInRange(root.left, X, Y);
        System.out.print(root.data+ " ");
        printInRange(root.right, X, Y);
    }
       else if( root.data >= Y){
          printInRange(root.left, X, Y);
       }
        else{
            printInRange(root.right, X, Y);
        }
}

public static  void  printPath(ArrayList<Integer> path){
     for(int i=0; i<path.size(); i++){
        System.out.print(path.get(i)+"->");
     }
   System.out.println();
}
public static void printRootToleaf(Node root , ArrayList<Integer> path){
    if(root == null){
         return;
    }

    path.add(root.data);
    //leaf
    if(root.left== null && root.right == null){
        printPath(path);
    }
  else{//mnoon leaf
    printRootToleaf(root.left, path);
    printRootToleaf(root.right, path);
  }
    path.remove(path.size()-1);

} 

    public static void main(String[] args) {

        int values[]= {5,1,3,4,2,7};
        Node root= null;



        for(int i=0; i<values.length; i++){
            root  = insert(root, values[i]);
        }

         /*
            inorder(root);
           System.out.println();
           printInRange(root,2,5);

          */


          printRootToleaf( root, new ArrayList<>());
      
 /*

/*   // for printing the   all orders
inorder(root);
System.out.println("This one is different..");
preOrder(root);
System.out.println("this is for differnitite");
postOrder(root);  
*/

/*
 * 
 // For Search function 
inorder(root);
System.out.println();
if(SearchKey(root, 0)){
    System.out.println("Key found");
} else{
    System.out.println("Key Not  found...");
}
 */
          
//for deletion operation
/*
    inorder(root);
DeleteNode(root, 3);
System.out.println();
inorder(root);
 */


/*
 * 
  inorder(root);
DeleteNode(root, 7);
System.out.println();
inorder(root);
 */

/*
    inorder(root);
DeleteNode(root, 2);
System.out.println();
inorder(root);
 */



  



     }
}