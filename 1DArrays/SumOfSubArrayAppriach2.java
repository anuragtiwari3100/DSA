import java.util.Scanner;    
public class SumOfSubArrayAppriach2{
       public static void MaxSubArraySum(int numbers[]){
         int currSum=0;
         int maxSum=Integer.MIN_VALUE;
         int prefix[]=new int [numbers.length];
          prefix[0]=numbers[0];
  //calculating prefix array
  for(int i=1; i<prefix.length;i++){
    prefix[i]=prefix[i-1]+numbers[i];
  }
     for(int i=0;i<numbers.length;i++){
                int start=i;
                for(int j=i;j<numbers.length;j++){
                    int end=j;
                    currSum=0;
                    currSum=start==0 ?prefix[end]:prefix[end]-prefix[start-1];
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


