public class modifiefKadan {
        public static int KanadAlgo(int arr[]){
           int maxNegative = Integer.MIN_VALUE;
           int  currSum = 0;
           int maxSum = Integer.MIN_VALUE;
           boolean hasNegative = false;
              for(int i=0; i<arr.length; i++){
                   if(arr[i]>0){
                    hasNegative = true;
                   }
                   if(arr[i]<0){
                    maxNegative =Math.max(maxNegative,arr[i]);
                   }
                   if(hasNegative){
                    currSum = currSum + arr[i];
                     if(currSum < 0){
                        currSum =0;
                     }
                    maxSum = Math.max(maxSum,currSum);
                   }
              }
              return  hasNegative ? maxSum :maxNegative;
        }
        public static int KanadAlgo1(int arr[]){
            int maxNegative = Integer.MIN_VALUE;
            int  currSum = 0;
            int maxSum = Integer.MIN_VALUE;
            boolean hasNegative = false;
               for(int i=0; i<arr.length; i++){
                    if(arr[i]>0){
                     hasNegative = true;
                    }
                    if(arr[i]<0){
                     maxNegative =Math.max(maxNegative,arr[i]);
                    }
                    if(hasNegative){
                     currSum = currSum + arr[i];
                      if(currSum < 0){
                         currSum =0;
                      }
                     maxSum = Math.max(maxSum,currSum);
                    }
               }
               return  hasNegative ? maxSum :maxNegative;
         }

         public static int maxSubArray(int[] nums) {
            int res = nums[0]; //starts off w starting element
            int total = 0; //initializing ans
     
            for(int n: nums){
             //traversing through array
             total += n;
             res = Math.max(total,res);
             if(total<0){
                 total=0; //if any negative element in the array adds up 
                 //and makes total negative, we reset the value
                 }
             }
            return res;
         }
        public static void main(String[] args) {
            int numbers[] = {-2, -3, -4, -1, -5}; 
            int ans = KanadAlgo(numbers);
            System.out.println(ans);
        }
    }



    /*
     Yes, you are correct! If the array contains only negative numbers, 
     the maximum subarray sum is the number
      closest to zero, i.e., the least negative number.
     */