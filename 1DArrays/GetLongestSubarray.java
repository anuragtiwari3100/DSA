import java.util.HashMap;
//LonestSubArrwhile Including max elements
public class GetLongestSubarray {
    

    public static int LongestSubarSumWithK1(int []a, long k) {
        int n = a.length; 
        int len = 0;
        for (int i = 0; i < n; i++) { 
            long s = 0; 
            for (int j = i; j < n; j++) { 
                s += a[j];

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    public static int getLongestSubarray(int []a, long k) {
        int n = a.length; // size of the array.

        int len = 0;
        for (int i = 0; i < n; i++) { 
            for (int j = i; j < n; j++) {
                long s = 0;
                for (int K = i; K <= j; K++) {
                    s += a[K];
                }

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }



  //Only for +ve numbers
    public static int printingTargetSumIncludingMaxEle(int arr[], long k){
        int left =0;
        int right =0;
        int maxlength =0;
        int sum = arr[0];
        int n = arr.length;
        while(right < n){
            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxlength  = Math.max(maxlength,right-left+1);
            }
            right++;
            if(right < n){
                sum += arr[right];
            }
        }
        return maxlength;
    }

public int longestSubarray(int[] arr, int k) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int sum =0;
       int maxLength =0;
       for(int i=0; i<arr.length; i++){
           sum += arr[i];
           if(sum == k){
              maxLength = Math.max(maxLength,i+1); 
           }
           int rem = sum -k;
           if(map.containsKey(rem)){
               int len = (i-map.get(rem));
               maxLength = Math.max(len,maxLength);
           }
           if(!map.containsKey(sum)){
               map.put(sum, i);
           }
       }
       return  maxLength;
    }
  
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
