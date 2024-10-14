import java.util.Scanner;



public class ZerOneTrangle {


     public static void  Zer_OneTrangle(int n){
        //Outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
               if((i+j)%2 == 0) {//even
                  System.out.print("1"+" ");

               }else{
                  System.out.print("0"+" ");
               }
            }
            System.out.println();
        }
     }
     public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter your no..");
        int n = sc.nextInt();
        Zer_OneTrangle(n); 
        sc.close(); 
     }
   
}

 