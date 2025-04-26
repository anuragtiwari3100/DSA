public class Set_Matrix_Zeroes_App2 {
    
        public static int[][] setAllZeros(int arr[][]){
            int  row = arr.length;
            int  col = arr[0].length;
         
            int rowArr[] = new int[row];
            int colArr[] = new int[col];
              for(int i=0; i<row; i++){
                  for(int j=0; j<col; j++){
                      if(arr[i][j] == 0){
                          rowArr[i] =1;
                          colArr[j] = 1;
                      }
                  }
              }
              for(int i=0; i<row; i++){
                  for(int j=0; j<col; j++){
                      if (rowArr[i] == 1 || colArr[j] == 1) {
                          arr[i][j] = 0;
                      }
                  }
              }
              return arr;
        }
        
        public static void main(String[] args) {
            System.out.println("Radhe-Krishn");
          int arr[][] = {
                        {0,1,2,0},
                        {3,4,5,2},
                        {1,3,1,5}
          };
           int res[][] = setAllZeros(arr);
           for(int i=0; i<res.length; i++){
               for(int j=0; j<res[0].length; j++){
                   System.out.print(res[i][j]+" ");
               }
               System.out.println();
           }
        }
    }