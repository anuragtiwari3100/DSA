import java.util.*;
public class invertedRotatedHafpyramid {
    public static void  printInvetedPyramid(int n){
        
        for(int i=1; i<=n; i++){
            for(int j=1;  j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
             System.out.print("*");
            }
            System.out.println();

        }
    }

  public  static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the level of pyramid that you want");
    int n = sc.nextInt();
    System.out.println(); 

    printInvetedPyramid(n);

  }
    
}
