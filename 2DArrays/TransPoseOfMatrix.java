public class TransPoseOfMatrix {

    public static void  transpose1(int arr[][], int row , int col){
         int  tempArr[][] = new int[row][col];
         for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
        tempArr[j][i] = arr[i][j];
            }
         }
       printArr(arr, row, col);
    }

 private static void transpose(int[][] matrix, int m, int n) {
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < m; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
    printArr(matrix, m , n);
}



    public static void printArr(int arr[][],int m , int n){
                for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static   void main(String  args[]){
          int matrix[][] =  {
             {4,5,6},
              {7,8,9},
             {10,11,12}
            };

        int m = matrix.length;
        int n = matrix[0].length;

         transpose(matrix, m , n);
    }
    
}
