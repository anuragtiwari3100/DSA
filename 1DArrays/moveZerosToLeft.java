
import java.util.Arrays;

public class moveZerosToLeft {
    public static void moveZerosLeft(int arr[]){
        int idx = arr.length-1;
         for(int i= arr.length-1; i>=0; i--){
            if(arr[i] !=0){
                arr[idx --] = arr[i];
            }
         }
         while(idx >= 0){
            arr[idx--] = 0;
         }
        System.out.println(Arrays.toString(arr));
         printArr(arr);
        }
        public static void printArr(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]);
            }
        }

        public static void movefirst(int arr[]) {
            int index = arr.length - 1; // Start from the end of the array
        
            // Step 1: Place all non-zero elements at the end
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] != 0) {
                    arr[index--] = arr[i];
                }
            }
        
            // Step 2: Fill the remaining positions at the start with zeros
            while (index >= 0) {
                arr[index--] = 0;
            }
        
            // Optional: Print the updated array for verification
            System.out.println("Updated array: " + Arrays.toString(arr));
        }
        
    public static void main(String args[]){
        int arr[] = new int[]{1,0,5,3,0,2,0};
        moveZerosLeft(arr);
    }
    
}
