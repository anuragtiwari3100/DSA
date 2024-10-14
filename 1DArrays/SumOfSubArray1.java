    
import java.util.Scanner;
public class SumOfSubArray1{
       public static void MaxSubArraySum(int numbers[]){
         int currSum=0;
         int maxSum=Integer.MIN_VALUE;
            for(int i=0;i<numbers.length;i++){
                int start=i;
                for(int j=i;j<numbers.length;j++){
                    int end=j;
                    currSum=0;
                    for(int k=start; k<=end; k++){  //print
                        currSum +=numbers[k];
                    }
                    System.out.println(currSum);
                     if(maxSum<currSum){
                        maxSum=currSum;
                     }
                }
            }
           System.out.println("max sum="+maxSum);  
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

