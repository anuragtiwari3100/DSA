
class Set_Matrix_Zeroes_App1 {
 public static void markRow(int row,int arr[][]){
     int col = arr[0].length;
       for(int j=0; j<col; j++){
           if(arr[row][j] != 0){
               arr[row][j] = -1;
           }
       }
 }
  public static void markCol(int col,int arr[][]){
    int row = arr.length;
    for(int k=0; k<row; k++){
        if(arr[k][col] !=0){
            arr[k][col] = -1;
        }
    }
 }
    public static int[][] MakeZer(int arr[][]){
        int row =arr.length;
        int col = arr[0].length;
       if(row == 0){
           return new int[][]{{0},{0}};
       }     
       for(int i =0; i<row; i++){
           for(int j=0; j<col; j++){
               if(arr[i][j] == 0){
                   markRow(i,arr);
                   markCol(j,arr);
               }
           }
       }
        for(int x=0; x<row; x++){
            for(int y=0; y<col; y++){
                if(arr[x][y] == -1){
                    arr[x][y] =0;
                }
            }
        }
        return arr;
    }
    
    
    public static void main(String[] args) {
      int arr[][] = {
      {1,1,1},
      {1,0,1},
      {1,1,1}
      };
       int res[][] = MakeZer(arr);
       int row = res.length;
       int col = res[0].length;
 for(int i =0; i<row; i++){
     for(int j=0; j< col; j++){
         System.out.print(res[i][j]+" ");
     }
     System.out.println();
 }
    }

}