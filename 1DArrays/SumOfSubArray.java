    
import java.util.Scanner;
public class SumOfSubArray{

    public static void MaxSubArraySum(int arr[]){   //o(n^3)
        int noOfSubArr =0;
        int maxSubArrSum =Integer.MIN_VALUE;
        int currSum = 0;
          for(int i=0; i<arr.length; i++){
               int start =i;
               for(int j=i; j<arr.length; j++){
                   int end =j;
                   currSum =0; //are resetting currSum to 0 before calculating the sum of a new subarray because each subarray's sum is calculated independently.
                    for(int k=start; k<=end; k++){
                        System.out.print(arr[k]+" ");
                        currSum += arr[k];
                    }
                      if(currSum>maxSubArrSum){
                        maxSubArrSum = currSum;
                      }
                    System.out.println();
               }
                               System.out.println();

          }
          System.out.println("The no of Sub Array is  "+noOfSubArr +"and the Maximum Subaraay sum is  "+maxSubArrSum);
  }


  public static int sumSubArr(int arr[]){   //O(n^2)
    int maxSum =Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        int currSum =0;
        for(int j=i; j<arr.length; j++){
            currSum +=arr[j];
            maxSum = Math.max(currSum,maxSum);
        }
    }
    return maxSum;
}


  public static void MaxSubArraySum2(int numbers[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[numbers.length];
    prefix[0] = numbers[0];
    //calculating prefix array  => kanade's algorithm
    for (int i = 1; i < prefix.length; i++) {
        prefix[i] = prefix[i - 1] + numbers[i];
    }
    for (int i = 0; i < numbers.length; i++) {
        int start = i;
        for (int j = i; j < numbers.length; j++) {
            int end = j;
            currSum = 0;
            if (start == 0) {
                currSum = prefix[end];
            } else {
                currSum = prefix[end] - prefix[start - 1];
            }
            if (maxSum < currSum) {
                maxSum = currSum;
            }
        }
    }
    System.out.println("max sum=" + maxSum);

}

public int maxSubArray(int[] arr) {
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
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int numbers[]=new int[5];
         System.out.println("enter your array having size 5:");
         for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
         }
         MaxSubArraySum(numbers);
         sc.close();

    }
    
}

