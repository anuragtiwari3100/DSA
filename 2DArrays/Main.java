import java.util.*;
class Main {
    public static ArrayList<Integer> spiralMatrix(int arr[][]) {
        int sr = 0;
        int sc = 0;
        int er = arr.length-1;
        int ec = arr[0].length-1;  // Fixed: added -1
        ArrayList<Integer> list = new ArrayList<>();
        
        while(sr <= er && sc <= ec) {
            //top
            for(int i=sc; i<=ec; i++) {  // Fixed: changed starting point to sc
                list.add(arr[sr][i]);
            }
            
            //right
            for(int i=sr+1; i<=er; i++) {  // Fixed: changed condition
                list.add(arr[i][ec]);
            }
            
            //bottom
            for(int k=ec-1; k>=sc; k--) {
                if(sr == er) {
                    break;
                }
                list.add(arr[er][k]);  // Fixed: added missing list.add
            }
            
            //left
            for(int l=er-1; l>sr; l--) {
                if(sc == ec) {
                    break;
                }
                list.add(arr[l][sc]);
            }
            
            // Fixed: moved increment/decrement inside while loop
            sr++;
            sc++;
            er--;
            ec--;
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        ArrayList<Integer> myList = spiralMatrix(arr);
        System.out.println(myList);
    }
} 