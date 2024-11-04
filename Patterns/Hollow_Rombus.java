import java.util.*;
public class Hollow_Rombus {

       public static void  printing_this(int n){
        //it only specify the boindry
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // 
            for(int k=1; k<=n; k++){
                if( i==1 || i==n || k==1 || k==n){
                    System.out.print("*");

                }else{
                    System.out.print(" ");

                }
             

            }
            System.out.println();
        }
       }

     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print(" "+"Please enter  your Range of  Shapes ...");
        int n  = sc.nextInt();
        printing_this(n);
     }
    
}




