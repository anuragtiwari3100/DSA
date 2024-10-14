import java.util.Scanner;

public abstract class arrIsSorted {
    public static boolean isSorted(int arr[],int i){
    if(i==arr.length-1){
        return true;
    }
    if(arr[i]>=arr[i+1]){
        return false;
    }
    isSorted(arr,i+1);
    return true;
    }
      public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int arr[]=new int[5];
            System.out.println("Enter the value of array:");
            for(int i=0;i<arr.length;i++){
               arr[i]=sc.nextInt();
            }
         System.out.println(isSorted(arr,0));
            sc.close();
}
} 