import java.util.Scanner;
import java.util.ArrayList;
public class TwoArrayList {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        System.out.print("enter the elements of first innerArray list:");
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        ArrayList<Integer>list1=new ArrayList<>();
                System.out.print("enter the elements of second innerArray list:");
        for(int i=0;i<5;i++){
            list1.add(sc.nextInt());
        }
        mainList.add(list1);
        mainList.add(list);
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer>currList=mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.print("The mainlist  is,having two inner list:");
        System.out.println(mainList);
        sc.close();
    }
    
}
