import java.util.Scanner;

public class Selection {
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minPos=i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
        }
  }
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
   int arr[]=new int[5];
  System.out.println("Enter the array:");
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
    selectionSort(arr);
    print(arr);
    sc.close();
}
}
