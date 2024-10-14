import java.util.Scanner;
import java.util.Arrays;
public class Inbuilt {
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
       Arrays.sort(arr);
       print(arr);

  sc.close();
}
}
