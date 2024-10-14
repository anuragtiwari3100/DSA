
import java.util.LinkedList;// we can also import  import java.util.*;  for all
public class Classroom {
    public static void main(String[] args){
       //create ->for that we have use  Class not primitive type of data like object int,float,boolean->Integer,Float,Character
      LinkedList<Integer> ll=new LinkedList<>();


       //add
ll.addFirst(1);
ll.addFirst(2);
ll.addFirst(0);
//0->1->->2
System.out.println("before Deletion"+ll);
       //remove
  ll.removeLast();
  ll.removeFirst (); 
  System.out.println("after deletion"+ll);

    }  
}
