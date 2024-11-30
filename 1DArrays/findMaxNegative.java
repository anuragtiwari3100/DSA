public class findMaxNegative {
    public static int findMaxNegative(int arr[]){
        int maxNegative = Integer.MIN_VALUE;
         boolean foundNegative = false;

         //   for (int num : arr) {
    //     if (num < 0) { // Check if the number is negative
    //         hasNegative = true;
    //         maxNegative = Math.max(maxNegative, num); // Update if the number is larger
    //     }
    // }

           for(int num=0; num<arr.length; num++){
             if(arr[num]< 0){
                foundNegative = true;
                maxNegative = Math.max(maxNegative,arr[num]);
             }
             if(!foundNegative){ 
                System.out.println("No negative number found in the array");
                return -1;
             }
            
           }
           return maxNegative;
    }


      public static void  isAllNegative(int arr[]){
            boolean allNegative = true;
            for(int x :arr){
                if(x>=0){
                    allNegative = false;
                    break;
                }
            }
            if(allNegative){
                System.out.println("All element in array were negative");
            }else{
                System.out.println("Not all elements were negative");
            }
      }
    public static void main(String args[]){
        int[] arr = {-4, -2, -7, -3, -1};
        int  res = findMaxNegative(arr);
        System.out.println("Max negative number is: "+res);
        isAllNegative(arr);
    }
    
}
