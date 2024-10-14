import java.util.Scanner;

public class WayToPairFriends {
    public static int friendsPairing(int n){
        if(n==1||n==2){
            return n;
        }
       /* // chooice->1.single,2.pair 
        //single
        int fnm1=friendsPairing(n-1);
        //pair
        int fnm2=friendsPairing(n-2);
        int pairWayays=(n-1)*fnm2;
        //toways
        int totays=fnm1+pairWayays;
        return totays; */
        // 2nd way
        return  friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
    }
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
     System.out.println("enter the no of friends,want make their pairs:");
     int n=sc.nextInt();
      System.out.println("way to pair is:"+friendsPairing(n));
      sc.close();
    }
    
}
