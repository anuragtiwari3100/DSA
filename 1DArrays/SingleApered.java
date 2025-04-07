import java.util.HashMap;
import java.util.Map;

public class SingleApered {


    public static int checkAppearance1(int arr[]){    //   T.C = O(n^2)    SC = O(1)
          for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int cnt =0;
             for(int j=0; j<arr.length; j++){
                if(arr[j] == num){
                    cnt++;
                }
             }
             if(cnt == 1){
                 return  arr[i];
             }
          }
    
        return  -1;
    }
   
    public static int checkApprearce2(int arr[]){
        
 int maxEle = Integer.MIN_VALUE;
 int minEle = Integer.MAX_VALUE;
 
 for (int i = 0; i < arr.length; i++) {
     if (arr[i] > maxEle) {
         maxEle = arr[i];
     }
     if (arr[i] < minEle) {
         minEle = arr[i];
     }
 }
 
 // Calculate offset to handle negative indices
 int offset = Math.abs(minEle);
 
 // Create a hash array large enough to handle all elements (positive and negative)
 int[] hashArr = new int[maxEle + offset + 1];  
 
 // Count occurrences
 for (int i = 0; i < arr.length; i++) {
     hashArr[arr[i] + offset]++;  
 }
 
 // Find the element that occurs once
 for (int j = 0; j < hashArr.length; j++) {
     if (hashArr[j] == 1) {
         return j - offset; 
     }
 }
 
 return -1;
    }


    public static int getSingleElement(int []arr) {
        //size of the array:
        int n = arr.length;

        // Declare the hashmap.
        // And hash the given array:
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        //Find the single element and return the answer:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }


    public static  int checkAppearance3(int arr[]){
        int xor =0;
        for(int i=0; i<arr.length; i++){
            xor = xor^arr[i];
        }
      return  xor;
        }
  
     
    
   
    public static void main(String[] args){
        int arr[] = {1,1,2,2,4,4,7};
        System.err.println("Num which appeared onece is  "+checkAppearance1 (arr));
    }
    
}
