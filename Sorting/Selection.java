import java.util.Scanner;

public class Selection {
    public static void selectionSort(int arr[]){
        for(int i=0;i<=arr.length-1;i++){   //0 to n-2 because we do not worry about the the last element b/c last element will automqatically conarin the maximum among all values
            int minPos=i;
            // System.out.println("min pos is"+minPos);
            for(int j=i+1; j<arr.length;j++){
                if(arr[minPos]>arr[j]){   //if(arr[minPos]<arr[j]){ //for descending order
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
//    int arr[]=new int[5];
//   System.out.println("Enter the  elements  of array:");
//       for(int i=0;i<arr.length;i++){
//         arr[i]=sc.nextInt();
//       }
int arr[] ={5,3,2,1,0};
      System.out.println("lenth is "+arr.length);
    selectionSort(arr);
    print(arr);
    sc.close();
}
}
