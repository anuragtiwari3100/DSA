import java.util.*;
public class floyedStrainagle {



    public static void floyed_Strainagle(int n){
        int counter=1;
   for(int i=1; i<=n; i++){
    //inner loop => here we have too tell how may times counter will  counted
   
      for(int j=1; j<=i; j++){
        System.out.print(counter+" ");
        counter++; // how many times counter has to print taht will be  controllled by j  and in which line it has to be print  will be  decided by i
// here after one iteration the value of counter will have been increased so next time it will be  starts from 2 rather than1
      }
      System.out.println();
}
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    floyed_Strainagle(3);
    
}
    
}