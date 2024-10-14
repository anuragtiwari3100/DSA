public class TransformOfSubtree {
    

    
   
    
  
        static class Node {
            int data;
            Node left;
            Node right;
            @Override
            public String toString() {
                return Integer.toString(data);
            
        }
    
            public Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
    
        // public static Node lca2(Node root, int n1, int n2) {
        //     if (root == null) {
        //         return null;
        //     }
        //     if (root.data == n1 || root.data == n2) {
        //         return root;
        //     }
    
        //     Node leftLca = lca2(root.left, n1, n2);
        //     Node rightLca = lca2(root.right, n1, n2);
        //     if (rightLca == null) {
        //         return leftLca;
        //     }
        //     if (leftLca == null) {
        //         return rightLca;
        //     }
    
        //     return root;
        // }





        //  public static int lcaDist(Node root , int n){

        //     if(root == null){
        //         return -1;
        //     }
        //     if(root.data == n){
        //         return 0;
        //     }
        //     int leftDist = lcaDist(root.left, n);
        //     int  rightDist =lcaDist(root.right, n);

        //     if(leftDist == -1 &&  rightDist == -1){
        //         return -1;
        //     }else if(leftDist == -1){
        //         return  rightDist+1 ;
        //     }else{
        //         return leftDist+1 ;
        //     }
        //  }




    //  public static int minDist(Node root, int n1, int n2){
    //     Node lca =lca2(root, n1, n2);
    //     int dist1 = lcaDist(lca, n1);
    //     int dist2 =   lcaDist(lca, n2);

    //     return dist1+dist2;
    //  }



    //  public static int KthAncetor(Node root, int n, int k){
    //       if(root == null){
    //         return -1;
    //       }
    //       if(root.data == n){
    //         return 0;
    //       }
    //       int leftDist =  KthAncetor(root.left, n , k);
    //       int rightDist = KthAncetor(root.right,n,k);
    //       if(leftDist == -1 && rightDist == -1){
    //          return -1; 
    //       }
    //       int  max = Math.max(leftDist, rightDist);
    //       if(max+1 == k){
    //        System.out.print(root.data);
    //       }
    //   return  max+1;


    //  }



     public static int transform(Node root){
        if(root == null){
            return 0;
        }
        int  leftChild = transform(root.left);
        int  rightChild = transform(root.right);

        int data =  root.data;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right== null ? 0 : root.right.data;        
        root.data =newLeft + leftChild + newRight + rightChild;
        return data;

     }



     public static void  preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
       preOrder(root.right);
     }


    
        public static void main(String[] args) {
            /*
     Given tree is;       
               1
              / \
              2  3
             / \ /\
            4  5 6 7

     //expected tree is :
                27
                /\
              9   13
             /\   /\
             0 0  0 0
            */
          

            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);
            System.err.println("Before Transformation of Tree....");
            preOrder(root);
            System.out.println();
          transform(root);
          System.out.println("After Transformation of tree...");
          preOrder(root);
            
          

        }
    
}
     
