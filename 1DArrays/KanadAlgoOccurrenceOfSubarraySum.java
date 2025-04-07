public class KanadAlgoOccurrenceOfSubarraySum {
    
    public static int findMaxSubarraySum(int arr[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0, tempStart = 0; // For tracking subarray indices
        boolean hasPositive = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
             hasPositive = true;

            currSum += arr[i];

            // Update maxSum and subarray indices if a new maximum is found
            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }

            // Reset currSum and tempStart if the current sum becomes negative
            if (currSum < 0) {
                currSum = 0;
                tempStart = i + 1;
            }
        }

        if (hasPositive) {
            printSubarray(arr, start, end);
            return maxSum;
        } else {
            // For negative-only arrays, return the maximum element
          return    handleNegativeOnlyArray(arr);  //yaha value nahi pura function return kar rahe hai
        }
    }


    // Handles negative-only arrays by finding the maximum element
    private static int handleNegativeOnlyArray(int[] arr) {
        int maxNeg = arr[0], index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNeg) {
                maxNeg = arr[i];
                index = i;
            }
        }
        printSubarray(arr, index, index);
        return maxNeg;
    }
    

    public static long maxSubarraySum(int[] arr, int n) {
        long maxSum= Integer.MIN_VALUE;
        long currSum = 0;
        int start = 0;
        int ansStart = -1, ansEnd = -1;
        boolean hasPos = false;
        long maxNegative = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>0){
                hasPos = true;
            }
            if (currSum == 0) {
               start = i; // starting index

            }
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;

                ansStart = start;
                ansEnd = i;
            }
            if (currSum < 0) {
                currSum = 0;
            }
            if(!hasPos){
                maxNegative = Math.max(maxNegative,arr[i]);
            }
        }    
        print(arr,ansStart,ansEnd);
        return hasPos ? maxSum : maxNegative;
    }
    
         public static void print(int arr[], int ansStart, int ansEnd){
       System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n sum is:");
        }

    // Prints the subarray between start and end indices
    private static void printSubarray(int[] arr, int start, int end) {
        System.out.print("Subarray with max sum: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        // int arr[] = {1, -5, 3, 6, -2};
        int arr[] ={ -8, -3, -6, -2, -5, -4 };
        int maxSum = findMaxSubarraySum(arr);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
