import java.util.Scanner;
import java.util.ArrayList;

public class PairSumPointerApproach {
    //bruite force
public static boolean pairsum1(ArrayList<Integer>list,int target){
     int lp=0;
     int rp=list.size()-1;

     while(lp!=rp){
        //case 1
        if(list.get(lp)+list.get(rp)==target){
         return true;
        }
        //case2
        if(list.get(lp)+list.get(rp)<target){
          lp++;
        } else{
            rp--;
        }
     }
      return false;
}

  public static void main(String[] args)  {
    Scanner sc=new Scanner(System.in);
              ArrayList<Integer>list=new ArrayList<>();
            //   //1,2,3,4,5,6
            //   list.add(1);
            //    list.add(2);
            //     list.add(3);
            //      list.add(4);
            //       list.add(5);
            //        list.add(6);
            System.out.print("Enter the value of arraylist:-");
            for(int i=0;i<5;i++){
                list.add(sc.nextInt());
            }
            
                   System.out.print("Enter the value of target:-");
                                   int target=sc.nextInt();

                   System.out.print(pairsum1(list,target));
                   sc.close();

      
  }  
}
