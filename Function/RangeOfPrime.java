import java.util.Scanner;
public class RangeOfPrime {
    public static boolean isPrime(int n){
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
    public static void PrimesRanges(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){//true
                 System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        System.out.println("Enterned number is:"+ " " +isPrime(n)+" "+ "means not prime");
        PrimesRanges(20);
        sc.close();
    }  
    
}
