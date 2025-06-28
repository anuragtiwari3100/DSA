import java.util.Scanner;

public class prime2 {


    // // only for n>=2
    // public static boolean  isPrime(int n){
    //     //corners cases
    //     //2
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i=2; i<=n-1; i++){
    //         if(n % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }


    public static boolean isPrime1(int n){
        if(n==2){
             return true;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    } 
    
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you   choice No");
        int n = sc.nextInt();
        // System.out.println(isPrime(n));
        System.out.println(isPrime1(n));
sc.close();

    }
}
