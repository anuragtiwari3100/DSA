import java.util.Scanner;
public class Prime {
 /*   FirstApproach => only for  n>=2
   public static boolean isPrime(int n){
     //corner cases
     //2
      if( n == 2){ 
        return true;
      }
       boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){ //completely dividing
             isPrime=false;  
             break;    
            }
        } 
        return isPrime;
    } */

//   Second Approach 
 public static boolean isPrime(int n){
        if(n==2){
             return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    } 

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        System.out.println("Enterned number is:"+isPrime(n));
        sc.close();
    }  
}
