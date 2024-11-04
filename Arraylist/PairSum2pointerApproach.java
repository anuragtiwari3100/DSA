//use mudulo arithmatic
import java.util.ArrayList;
import java.util.Scanner;

public class PairSum2pointerApproach {
    public static boolean printSum2(ArrayList<Integer>list,int target){
        int bp=-1;   // not a valid index
        int n=list.size();
        for(int i=0; i<list.size();i++){
            if(list.get(i)>list.get(i+1)){ //breaking point
                bp=i;
                break;
            }
        }
        int lp=bp+1; //smallest
        int rp=bp;// largest
         while(lp!=rp){
            //case1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            //caase2
           else  if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }else{
                //case3
                rp=(n+rp-1)%n;
            }
         }
         System.out.println("sorry target element could not be found in list:");
return false;


    } 
      public static void main(String[] args)  {
              ArrayList<Integer>list=new ArrayList<>();
              Scanner sc=new Scanner(System.in);
           // 11,15,6,8,9,10- sorted & rotated array
           list.add(11);
            list.add(15);
             list.add(6);
              list.add(8);
               list.add(9);           
                list.add(10);
                   System.out.print("Enter the value of target:-    ");
                    int target =sc.nextInt();
                   System.out.print(printSum2(list,target));
                   sc.close();

      
  }  
}
