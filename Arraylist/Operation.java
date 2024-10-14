import java.util.ArrayList;
public class Operation {
 public static void main(String[] args){
    ArrayList<Integer> list=new ArrayList<>();
    // add opertaion->Time comp;exity O(1)
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    list.add(1,0);
    

 /*  // get opertaion->Time comp;exity O(1)
    int element=list.get(2);
    System.out.println(element); */


/**  // delete =>tc O(n) liner tc ; 
  list.remove(3);
  System.out.println(list); */

/* set=> at specified index=>tc O(n); 
list.set(2,0);
  System.out.println(list);
 } */


/*  
  //containe=>to check  wetaher element present or not =>O(n)
 System.out.println(list.contains(1));
 System.out.println(list.contains(11));
 */

}
}
