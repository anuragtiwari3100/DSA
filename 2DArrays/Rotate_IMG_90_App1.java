import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Rotate_IMG_90_App1{
   
    public static int [][] rotateZeo(int matrix[][], int row, int col){
        int n = matrix.length;
        int resArr[][] = new int[row][col];
        if(resArr.length ==0){
            return  new int[][]{{-1}};
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
             resArr[j][i] = matrix[i][j];
            }
        }
        return resArr;
    }



    
     public static ArrayList<ArrayList<Integer>> rotate(ArrayList<ArrayList<Integer>> matrix) {
        int n = matrix.size();
        int m = matrix.get(0).size();

        // Create the result list with empty rows
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            ArrayList<Integer> row = new ArrayList<>(Collections.nCopies(n, 0));
            result.add(row);
        }

        // Fill in the rotated values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result.get(j).set(n - 1 - i, matrix.get(i).get(j));
            }
        }

        return result;
    }

   

public   static void  main(String [] args){





            ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();
        arr1.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        arr1.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        arr1.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        ArrayList<ArrayList<Integer>> rotated = rotate(arr1);

        System.out.println("Rotated Matrix is:");
        for (ArrayList<Integer> row : rotated) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    


        



        int arr[][] = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
      int row = arr.length;
      int col = arr[0].length;
      int res[][]  = rotateZeo(arr,row, col);
System.out.println("Rotated matrix is");
      for(int i=0; i<row; i++){
          for(int j=0; j<col; j++){
            System.out.print(res[i][j]+" ");
          }
          System.out.println();
      }

}    

}
