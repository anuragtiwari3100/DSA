import java.util.*;

public class looping {
  public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();

    // add opertaion->Time comp;exity O(1)
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    
    System.out.println("Size of array list is:"+list.size());
     for(int i=list.size()-1;i>=0;i--){
        System.out.println(list.get(i));
    }
    System.out.println("elements of arraylist are:");
    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }
}
}