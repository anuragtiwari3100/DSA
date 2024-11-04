
import java.util.Arrays;
import java.util.Collections;
public class Inbuilt3 {
    public static void print(Integer arr[]){
        for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
        }
  }

    public static void main(String[]args){
    // int arr[]={5,4,1,3,2} ;  ->iske lie rev nhi le saktre
    Integer arr[]={5,4,1,3,2} ; 
    // if we want to sort specified  sub array then we can apply this technique
       Arrays.sort(arr,0,3,Collections.reverseOrder());
       print(arr);

 
}
}
