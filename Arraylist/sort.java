import java.util.ArrayList;
import java.util.Scanner;
// to  use inbuilt sort we have to import => import  java.util.collections;
import java.util.Collections;
public class sort {
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      ArrayList<Integer>list=new ArrayList<>();
      System.out.print("enter elements:");
      for(int i=0;i<5;i++){
        list.add(sc.nextInt());
      }
      System.out.print("list having elements before sort: "+list);
      // sort in asending order
      Collections.sort(list);
      System.out.println();
       System.out.print("list having elements  after  sort:"+list);
       Collections.sort(list,Collections.reverseOrder());
       System.out.println("list having element after sort in reverse order"+list);
      sc.close();
    }
    
}
