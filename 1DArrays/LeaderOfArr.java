import java.util.ArrayList;
import java.util.List;

public class LeaderOfArr {

        /**
     * 
     Input: arr = [17,18,5,4,6,1]
     Output: [18,6,1]
     */
 
    //Brute~~
    public static List<Integer> Leader1(int arr[]){
       int n = arr.length;
       List<Integer> list =  new ArrayList<>();
       for(int i=0; i<arr.length; i++){
        boolean  leader = true;
          for(int j=i+1; j<arr.length; j++){
            if(arr[j]>arr[i]){
                leader = false;
                break;
            }
          }
          if(leader == true){
            list.add(arr[i]);
          }
       }
        return list;
    }
  
    public  static List<Integer> Leader2(int arr[]){
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int max= arr[n-1];
        list.add(arr[n-1]);
     for(int i=n-2; i>=0; i--){
         if(arr[i]>max){
             list.add(arr[i]);
             max = arr[i];
         }
     }
    //  Collections.reverse(list);   // for returning in the revers order
     return list;
    }
    public static void main(String[] args){
        int arr[] ={17,18,5,4,6,1};
        List<Integer> res =Leader2(arr);
        System.out.println(res);

    }
    
}
