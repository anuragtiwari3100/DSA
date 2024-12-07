import java.util.Scanner;
    // Here we try to print each individual sub array
    // a subarray is a contiguous segment of the original array
public class SubArray {
       public static void PrintingSubArray(int numbers[]){
          int NoOfSubArray=0;
            for(int i=0;i<numbers.length;i++){
                int start=i;
                for(int j=i;j<numbers.length;j++){
                    int end=j;
                    for(int k=start; k<=end; k++){  //print
                        System.out.print(numbers[k]+" ");// subarray
                    }
                    NoOfSubArray++;
                    System.out.println();
                }
                System.out.println();
            }
           System.out.println("Total sub arrays are: "+NoOfSubArray);  
       }

       public static   int  possiblePair(int arr[]){
        int n = arr.length;
        return  n*((n+1)/2);
    }
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int numbers[]=new int[3];
         System.out.println("enter your array having size 5:");
         for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
         }
         possiblePair(numbers);
         PrintingSubArray(numbers);
         sc.close();

    }
    
}
