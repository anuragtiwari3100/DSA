package hashSet;
import java.util.HashSet;
import java.util.*;
import java.lang.String;
public class lact {
 
    
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mimbai");
        cities.add("Noida");
        cities.add("Benguluru");

        Iterator it = cities.iterator();
        while (it.hasNext()) {
      System.out.println(it.next());   //this .next  meathod wiill  print the next item and also  will be update           
        }
     

    for(String city : cities){
        System.out.println(city);
    }


    }
}
