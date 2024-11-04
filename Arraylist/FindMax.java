 import java.util.Scanner;
 import java.util.ArrayList;
 
public class FindMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
      /* 
       list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5); */
        // to take dynamiccally input
        System.out.println("Enter the value of arraylist");
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        int max = Integer.MIN_VALUE;
        /*
         * for(int i=0;i<list.size();i++){
         * if(max<list.get(i)){
         * max=list.get(i);
         * }
         * }
         */
        // or we can use inbuilt function
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        System.out.println("Max element  is:" + max);
        sc.close();
    }

}
