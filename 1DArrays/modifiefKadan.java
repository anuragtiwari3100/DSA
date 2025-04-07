public class modifiefKadan {
        public static int KanadAlgo(int arr[]){
         //Considering for all positive   numbers
           int maxNegative = Integer.MIN_VALUE;
           int  currSum = 0;
           int maxSum = Integer.MIN_VALUE;
           boolean hasPositive = false;
              for(int i=0; i<arr.length; i++){
                   if(arr[i]>0){
                     hasPositive = true;
                   }
                   if(arr[i]<0){
                    maxNegative =Math.max(maxNegative,arr[i]);
                   }
                   if(hasPositive){
                    currSum = currSum + arr[i];
                     if(currSum < 0){
                        currSum =0;
                     }
                    maxSum = Math.max(maxSum,currSum);
                   }
              }
              return  hasPositive ? maxSum :maxNegative;
        }
        
        public int maxSubArray2(int[] arr) {
            int currSum =0;
            int maxSum =Integer.MIN_VALUE;
            boolean hasPosiive = false;
            int maxNegativeSum = Integer.MIN_VALUE;
            for(int i=0; i<arr.length; i++){
                 if(arr[i]>0){
                    hasPosiive = true;
                 }
                if(hasPosiive){
                  currSum = currSum+arr[i];
                  if(currSum < 0){
                    currSum = 0;
                  }  
                  maxSum = Math.max(currSum,maxSum);
                }
                if(!hasPosiive){
                  maxNegativeSum = Math.max(maxNegativeSum,arr[i]);
                }
            }
            return hasPosiive ? maxSum :maxNegativeSum;
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

         public static void KadaneSOccurence(int[] arr) {
            int maxSum = Integer.MIN_VALUE, currSum = 0;
            int start = 0, end = 0, tempStart = 0;
            boolean allNeg = true;
            int maxNeg = Integer.MIN_VALUE;
        
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 0) allNeg = false;
                if (arr[i] < 0) maxNeg = Math.max(maxNeg, arr[i]);
        
                currSum += arr[i];
        
                if (currSum < 0) {
                    currSum = 0;
                    tempStart = i + 1;
                } else if (currSum > maxSum) {
                    maxSum = currSum;
                    start = tempStart;
                    end = i;
                }
            }
        
            if (allNeg) {
                System.out.println("Max sum: " + maxNeg);
                System.out.println("Subarray: " + maxNeg);
            } else {
                System.out.println("Max sum: " + maxSum);
                System.out.print("Subarray: ");
                for (int i = start; i <= end; i++) System.out.print(arr[i] + " ");
            }
        }
        
        public static void main(String[] args) {
            int numbers[] = {-2, -3, -4, -1, -5,8}; 
            int ans = KanadAlgo(numbers);
            System.out.println(ans);
        }
    }



    /*
     Yes, you are correct! If the array contains only negative numbers, 
     the maximum subarray sum is the number
      closest to zero, i.e., the least negative number.
     */