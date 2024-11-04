import java.util.*;
public class MajorityElement {
public static void main(String[] args) {
    int  arr[] = {1,3,2,5,1,3,1,5,1};
   HashMap<Integer,Integer> map = new  HashMap<>();
    for(int i=0; i<arr.length; i++){
    //     if(map.containsKey(arr[i])){
    //         map.put(arr[i],map.get(arr[i])+1);
    //     }else{
    //         map.put(arr[i],1);
    //     }
    
    // alternate  b.c in  both cases at the end we are putiing so
   map.put(arr[i],map.getOrDefault(arr[i],0)+1);
}
    // Set<Integer> keySet =  map.keySet(); // here we have explicity store  the keyset by calling the  keyset()
    // for(Integer key : keySet){
            //alternate
        for(Integer key : map.keySet())    
        if(map.get(key) > arr.length/3){
            System.out.println(key);
        }
    }
}
    
