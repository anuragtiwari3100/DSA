package hashSet;
import java.util.*;
public class linkedHashmaps {
    public static void main(String[] args) {

        //Creating a Hashset => random Order
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mimbai");
        cities.add("Noida");
        cities.add("Benguluru");
    System.out.println(cities);
    

    //
    //reating  a linkedHashSet => printed how they were enered
        LinkedHashSet<String> lhs= new  LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mimbai");
        lhs.add("Noida");
        lhs.add("Benguluru");
        // System.out.println(lhs);
        // lhs.remove("Delhi");
        System.out.println(lhs);

     //Creating a  Tree Set =>Sorted or Assending according to Alphabet
     TreeSet<String > ts = new TreeSet<>();
     ts.add("Benguluru");
     ts.add("Noida");
     ts.add("Delhi");
     ts.add("Mimbai");
     System.out.println(ts);
 
    }
}
