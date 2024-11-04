import java.util.Scanner;
public class Bubble{
    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length;turn++)   {
            //arr.length-1 because we do not worry about the the last   element b/c last element will automqatically conarin the maximum among all   values
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
         public static void print(int arr[]){
               for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
               }
         }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size  of Your Array:");
        int n = sc.nextInt();
         int arr[]=new int[n];
         System.out.println("Enter the array:");
             for(int i=0;i<arr.length;i++){
               arr[i]=sc.nextInt();
             }
       bubbleSort(arr);
        print(arr);
sc.close();

  }
}
    
