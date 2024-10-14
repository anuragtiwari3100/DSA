
//try to  take input  form console
import java.util.Scanner;

public class hollowReactangle {
    public static void  hollow_Reactangle(int totalRows,int totalCols){
       
        for(int i=1; i<=totalRows; i++){
            for(int j=1; j<=totalCols; j++){
                if(i==1 || i==totalRows || j==1 || j==totalCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }

     public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
       
        hollow_Reactangle(4,5);

     }

}