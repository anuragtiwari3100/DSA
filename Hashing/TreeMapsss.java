import java.util.HashMap;
import java.util.TreeMap;
public class TreeMapsss<K, V>{
    public static void main(String[] args) {
    TreeMap<String,Integer> tm = new TreeMap<>();
    HashMap<String,Integer> hm =  new HashMap<>();
    
    tm.put("India",150);
    tm.put("Pakistan",78);
    tm.put("Bangladesh",67);
    tm.put("Indonewshia",78);
System.out.println("Sequnece is maintained according to keys..."+tm);

hm.put("India",150);
hm.put("Pakistan",78);
hm.put("Bangladesh",67);
hm.put("Indonewshia",78);
System.out.println("Unorder  collection is .."+tm);
    }
}
