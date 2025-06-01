

public class Rotate_ImageBy90_App2 {

            //step 1.transpose

    public static void Transpose(int arr[][] , int  row , int col){
      for(int i=0; i<row; i++){
        for(int j=i+1; j<col; j++){
          int temp = arr[i][j];
          arr[i][j] = arr[j][i];
          arr[j][i] = temp;
        }
      }

      revEachRow(arr,row, col);

    }

    //step.2 Rev each row
    public static void revEachRow(int arr[][], int row ,int col){
        int n = arr.length;
        for(int i=0; i<row; i++){
            for(int j=0; j<arr.length/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-1-j];
                arr[i][n-1-j] = temp;
            }
        }
        printArr(arr, row, col);
        
    }

    //step 3  printing the array
    public static void printArr(int arr[][], int n , int m){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
                System.out.println();
        }
        System.out.println();
    }



   
    public static void main(String args[]) {
           int matrix[][] =  {
              {1,2,3},
              {4,5,6},
              {7,8,9}
            };

            int row =matrix.length;
            int col = matrix[0].length;
           Transpose(matrix,row,col);
            

    }
    
}
