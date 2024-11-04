import java.util.*;

public class BuildingTreePreOrder {


    static class Node{
        int data;
        Node left;
        Node right;


        Node(int data){
   this.data = data;  //  // Set the data of the node => Node class ke data ame  params through send data ko store karo
   this. left  = null;      // Initially, no left child
   this.right = null;    // Initially, no right child
        }
    }


       static class BinaryTree{
         static int idx =-1;
        public static Node buildTree(int nodes[]){
           idx ++;
             if(nodes[idx] == -1){
                return null;
             } 
             Node  newNode = new Node(nodes[idx]);// creating an object of  Node class to call its Constructor                                new Node(nodes[idx]) calls the constructor of the Node class, passing the current value from the nodes array as an argument./
            newNode.left =   buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;


        }
       }

       public static  void  preOrder(Node root){
        if(root  ==   null){
          return  ;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
       
       }


         public static   void  inOrder(Node root){//how  root not root.data
          if(root  == null){
            return ;
          }
          inOrder(root.left);
          System.out.print( root.data);
          inOrder(root.right);

         }


          public static  void postOrder(Node root){
            if( root == null){
              return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");


          }
 



          
    public static void levelOrder(Node root){
      if(root  ==   null){
        return;
      }
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      q.add(null);

      while(!q.isEmpty()) {
         Node currNode =  q.remove();// ye agar val  ho to wo return karega else  null
          if(currNode == null){
            System.out.println();
            if(q.isEmpty()){
              break;
            }else{
              q.add(null);
            }
          }else{
            System.out.print(currNode.data +" ");
              if(currNode.left != null){
                q.add(currNode.left);
              }
              if(currNode.right != null){
                q.add(currNode.right);
              }
          }
      }
  

    }



    public static  int countOfNodes(Node root){
      if(root == null){
        return 0;
      }

      int  leftNodes = countOfNodes(root.left);
      int  rightNodes =  countOfNodes(root.right);
        return  leftNodes + rightNodes +1;
    }



    
 public static int sumOfNode(Node root){
    if(root == null){
      return 0;
    }
    int leftSum =  sumOfNode(root.left);
    int rightSum = sumOfNode(root.right);
     return leftSum + rightSum + root.data;
 } 



 static int heightOfTree(Node root){
  if(root == null){
       return 0;
  }

  int leftHeight   =  heightOfTree(root.left);
  int  rightHeight =  heightOfTree(root.right);

  return   Math.max(leftHeight , rightHeight)+1;
}



public static  int     DiameterApp1(Node root){   //O(n^2)

  if(root ==   null){
       return -1;
  }
  int leftSubtree = DiameterApp1(root.left);
  int rightSubtree = DiameterApp1(root.right);
int  Myheight = heightOfTree(root.left) + heightOfTree(root.right)+1;
return  Math.max(Myheight , Math.max(leftSubtree,rightSubtree));
  

}


 static class TreeInfo{
  int ht;
  int diam;
   
       TreeInfo(int ht, int diam){
        this.ht =  ht;
          this.diam = diam;

       }
}

public static TreeInfo diameter2(Node root){  // retuern type is TreeInfo because it has to retuern 2  values ht and diameter  2 return  ho nahi skate to  Information retuern kar iya  
     
  if( root == null){
      return new  TreeInfo(0, 0);
  }
  TreeInfo left = diameter2(root.left);
  TreeInfo  right = diameter2(root.right);
  int myHeight = Math.max(left.ht, right.ht)+1;

  int diam1 =  left.diam;
  int diam2 =  right.diam;
  int diam3 = left.ht+right.ht+1;
  int myDiam  = Math.max(Math.max(diam1,diam2),diam3);
  TreeInfo myInfo = new  TreeInfo(myHeight, myDiam);
  return myInfo;


}



    public static void main(String[] args) {
        int nodes [] ={ 1, 2, 4, - 1 ,- 1,5 , - 1, - 1, 3 ,- 1 ,6 ,- 1, - 1 };
        BinaryTree  tree = new BinaryTree();
      Node root =   tree.buildTree(nodes);
      // System.out.println(root.data);

      /* we can call  static meathod directly by using their className
         Node root=  BinaryTree.buildTree(nodes);
      System.out.println("The Data of the root is"+root.data);
       */
    
      // preOrder(root);
      // inOrder(root);
      // postOrder(root);
      // levelOrder(root);
      // System.out.println(countOfNodes(root));
      // System.out.println(countOfNodes(root));
            //  System.out.println("The Diameter of tree is : "+DiameterApp1(root));      
            // System.out.println("The Diameter of tree is : "+diameter2(root).diam);      

      System.out.println(heightOfTree(root));
    }
    
}
