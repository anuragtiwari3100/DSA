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
 }`
 
 return -1;
    }
   
    public static void main(String[] args){
        int arr[] = {1,1,2,2,4,4,7};
        System.err.println("Num which appeared onece is  "+checkAppearance1 (arr));
    }
    
}
