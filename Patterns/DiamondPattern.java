import java.util.*;
public class DiamondPattern {

      public  static void Print_Diamond(int n){

        //This is our first half
        //this outer loop is just for  specify boundry condition
        for(int i=1; i<=n; i++){
            //spaces =>n-i
           for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
           }
           //stars =>2*i-1
           for(int k=1; k<=(2*i-1); k++){
            System.out.print("*");
           }
           System.out.println(); 

        }
       //2nd half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){
             System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++){
             System.out.print("*");
            }
            System.out.println();
 
         }
 

      }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter Your No...");
         int n = sc.nextInt();

        Print_Diamond(n);
    }
    
}
