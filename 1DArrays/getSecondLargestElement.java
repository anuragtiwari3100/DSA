import java.util.Arrays;
public class getSecondLargestElement {

    //TC. O(n) & SC = O(1)
    public static int getSecondLargest(int arr[]){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i]; 
            }else{
                if(arr[i] > secondLargest && arr[i] != largest){
                    secondLargest = arr[i];
                }
            }
        }
        return secondLargest;
    }

    public static int  getSecondLargest1(int arr[]){

        int n = arr.length;
        Arrays.sort(arr);
        int max = arr[n-1];
        int sMax = Integer.MIN_VALUE;
        for(int i = n-2; i>=0; i++){
            if(arr[i] < max){
                sMax = arr[i];
                break;
            }
        }
        return sMax;
    }
    public static void main(String args[]){
        int arr[] = {7,4, 2, 0, 6, 3, 2, 5};
        System.out.println("Second largest element is: " + getSecondLargest(arr));
        // System.out.println("Second largest element is: " + getSecondLargest1(arr));

    }
    
}
