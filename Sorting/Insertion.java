import java.util.Scanner;
public class Insertion {
    public static void  InsertionSort(int arr[]){
     for(int i=1;i<arr.length;i++){  //i=1 because we assume that the first element is already sorted    
        int curr=arr[i]; 
        int prev=i-1;
        // finding out the  correct pos to insert 
        // while(prev>=0 && arr[prev]<curr){   -> will be print in descinsing order
             while(prev>=0 && arr[prev]>curr){
            arr[prev+1]=arr[prev]; // storing the previous element in the next index
            prev--;
        }
        //insertion
     arr[prev+1]=curr;
     }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
        }
  }
    
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    System.out.println("Enter the elements of array whose size is 5:");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    InsertionSort(arr);
    print(arr);
    sc.close();
    }
}
