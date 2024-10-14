  
  import java.util.*;
  public class SolidRombus{

    public static  void SolidRombus_str(int n){
        // this is for just outer boundry
         for(int i=1; i<=n; i++){
            //this is for void spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //this is for stars
             for(int k=1; k<=n; k++){
                System.out.print("*");
             }
             System.out.println();

         }
    }

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("please enter the range of Rombus");
            int n = sc.nextInt();
            SolidRombus_str(n);

        }

}