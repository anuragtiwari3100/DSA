
import java.util.Arrays;
public class Inbuilt2 {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
        }
  }

    public static void main(String[]args){
    int arr[]={5,4,1,3,2};
    // if we want to sort specified  sub array then we can apply this
       Arrays.sort(arr,0,3);
       print(arr);

 
}
}
