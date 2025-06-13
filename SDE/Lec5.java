package SDE;

public class  Lec5{


     public static boolean  isPrime(int n){
        if(n ==2){
            return  true;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return  false;
            }
        }
        return  true;
     }


  // not optimal appraoch
    public static double power(int n, int x) { ////n is base and x is exponent
    if (x == 0) return 1;

    if (x > 0) {
        return n * power(n, x - 1);
    } else {
        return 1.0 / power(n, -x); 
    }
}









    public static void main( String args[]){
       
        // System.out.println(Math.sqrt(7));
        // System.out.println(power(2,-3));
              System.out.println(power2(2,-3));
       

    }
    }