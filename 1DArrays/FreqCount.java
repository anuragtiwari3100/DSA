import java.util.HashMap;
import java.util.Map;
public class FreqCount {
    public static int[] freqCount(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int resArr[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            resArr[arr[i]]++;
        }
        return resArr;
    }
   //with explict condition
    public static int CountFreq(int arr[]){
        for(int i=0; i<arr.length; i++){
         int   freq=0;
          for(int j=0; j<arr.length; j++){
          if(arr[i] == arr[j]){
           freq ++; 
     }
           if(freq > arr.length/2){
         return arr[i];
       }
     } 
     }
      return -1;    
     }

    public static void freq(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int key : map.keySet()) {
            System.out.println(key + "->" + map.get(key));
        }

    }

    public static int findMostFreq(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int maxFreq = 0;
        int mostFreqElement = -1;

        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "------->" + entry.getValue());
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostFreqElement = entry.getKey();
            }
        }
        System.out.println("The maximum Frequent element is  ");
        return mostFreqElement;
    }


    public static int majorityElement(int []v) {
        int n = v.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);
        }
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
         }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println("............");
        int arr[] = { 2, 3, 5, 6, 7, 7, 1, 8, 9, 8, 8, 8, 0, -1 };
        freq(arr);

    }
}
