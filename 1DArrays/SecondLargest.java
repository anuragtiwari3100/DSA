
import java.util.Arrays;
class SecondLargest {
    
    public   static int findSecondMax(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        int largest = arr[n-1];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=n-2; i>=0; i--){
            if(arr[i]<largest){
                secondLargest = arr[i];
                  break;
            }
          
        }
        return  secondLargest;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,2,4,5,5,6,6};
     int res = findSecondMax(arr);
     System.out.println(res);
    }
}