import java.util.ArrayList;
import java.util.HashMap;
class  Union {
            //Approach1
            public static  ArrayList<Integer> findUnion(int arr1[], int arr2[]){
                int n= arr1.length;
                int m = arr2.length;
            HashMap<Integer,Integer> freq = new HashMap<>();
            ArrayList<Integer> Union = new ArrayList<>();
            for(int i=0; i<arr1.length; i++){
            freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
            }
            for(int i=0; i<arr2.length; i++){
                freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
            }
            
            for(int x:freq.keySet()){
                Union.add(x);
            }
            return Union;
            }
    public static void main(String[] args) {
  int arr1[] = {1,2,3,4,5,9,10};
  int arr2[] = {3,4,5,6,7,8};
   ArrayList<Integer> res =findUnion(arr1, arr2);
   System.out.print(res+" ");
   
  
    }
}