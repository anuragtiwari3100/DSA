import java.util.Scanner;
public class PairOfArr {

    public static void Printingpair(int numbers[]){
        int NoOfpair=0;
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];  //1,2,3,4,5(cur-1->2->3->4)
            for(int j=i+1;j<numbers.length;j++){  //(1->2,3,4,5),(2->3,4,5),(3->4,5),(4->5)
                System.out.print("("+curr+","+numbers[j]+")");
               NoOfpair++;
            }
            System.out.println();
        }
         System.out.println("Total Pairs ="+NoOfpair);
    }


    /*
     
    Input: arr[] = {1, 2} 
Output: (1, 1), (1, 2), (2, 1), (2, 2).
     */
    public static int calculatePairs(int arr[]) {
        int n = arr.length;
        return (n * (n - 1)) / 2; // O(1)
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numbers[]=new int[5];
        System.out.println("Enter your Array having size of 5:");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        
        System.out.println("Pairs of enterned array is");
        Printingpair(numbers);
        int optimalPairs = calculatePairs(numbers);
        System.out.println("Optimal number of pairs: " + optimalPairs);
        sc.close();
    }
    
}
 