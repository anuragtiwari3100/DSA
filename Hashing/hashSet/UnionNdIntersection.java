package hashSet;
import java.util.*;

public class UnionNdIntersection {
    

    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] ={6,3,9,2,9,4};
        HashSet<Integer> set = new HashSet<>();

        //calculating => union
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int j=0; j<arr2.length; j++){
            set.add(arr2[j]);
        }

        System.out.println("Union ="+set.size());
        System.out.println(set);

        //calculating =>iNtersection
  //to calculate intersection we would be need of an emty intersection
    set.clear();
    System.out.println(set);
    for(int i=0; i<arr1.length; i++){
        set.add(arr1[i]);
    }


    int count = 0;
    for(int i=0; i<arr2.length; i++){
         if(set.contains(arr2[i])){
            count++;
            set.remove(arr2[i]);   // so that it won't count again agin b/c intersection also contain  unique elements
         }
    }

   System.out.println("Intersection ="+count);

    }
}

//hw.=>print all the elements of union and intersection

