    
import java.util.Scanner;
public class SumOfSubArray1{

    public static void MaxSubArraySum(int arr[]){
        int noOfSubArr =0;
        int maxSubArrSum =Integer.MIN_VALUE;
        int currSum = 0;
          for(int i=0; i<arr.length; i++){
               int start =i;
               for(int j=i; j<arr.length; j++){
                   int end =j;
                   currSum =0;
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

