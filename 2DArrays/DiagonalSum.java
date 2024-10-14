

  /* 
       public class DiagonalSum { 
         //note this is not highly optimized code  T.C O(n^2);
    public static int  diagonalsum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    // sum= sum+matrix[i][j];
                    sum+=matrix[i][j];
                }else if(i+j== matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    */
    // t.c= O(n)
    public class DiagonalSum { 
    public static int DGS(int matrix[][]){
         int sum=0;
         for(int i=0; i<matrix.length; i++){
        //PD
          sum+=matrix[i][i];
          //SD
          if(i !=matrix.length-1-i){
            sum+=matrix[i][matrix.length-i-1];
          }        
    }
     return sum;
}
    public static  void  main(String[] args){
        int matrix[][]={{1,2,3,4},
                         {5,6,7,8},
                          {9,10,11,12},
                         {13,14,15,16}};
                        //  System.out.println("sum is:"+diagonalsum(matrix));
          System.out.println("sum is:"+DGS(matrix));
    }
    
}
