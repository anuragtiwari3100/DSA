import java.util.Scanner;
public class DecrisingOrder {
    public static void printDecresingOrder(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDecresingOrder(n-1);
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        printDecresingOrder(n);
        sc.close();

    }
    
}
