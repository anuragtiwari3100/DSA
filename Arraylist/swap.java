
import java.util.ArrayList;
import java.util.Scanner;

public class swap {
    public static void  swaping(ArrayList<Integer>list,int idx1, int idx2){// similar to f_name(int arr[])
       int temp=list.get(idx1);
      list.set(idx1,list.get(idx2));
      list.set(idx2,temp);  

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter 5 integers:");

        for (int i = 0; i <5; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("The ArrayList contains before  swap: " + list);
       int idx1=1, idx2=3;
        swaping(list,idx1,idx2);
        System.out.println("The ArrayList contains after swap:"+list);
        sc.close();
    }
}
