// import java.util.HashMap;
// import java.util.LinkedHashMap;
import java.util.*;
public class LinkedHasmaps<K, V> {
    public static void main(String[] args) {
    LinkedHashMap<String ,Integer> lhm = new LinkedHashMap<>();
    HashMap<String,Integer> hm = new HashMap<>();
    
    lhm.put("India",100);
    lhm.put("Pakistan", 71);
    lhm.put("BanglaDesh",45);
    System.out.println("In insertin ORder"+lhm);
    hm.put("India",100);
    hm.put("Pakistan", 71);
    hm.put("BanglaDesh",45);
    System.out.println("No  order"+hm);
    


    }   
}
