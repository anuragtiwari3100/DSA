 import java.util.Scanner;

public class BinomialCoff {
     public static int  fac(int n){
   int f=1;
   for(int i=1;i<=n;i++){
       f=f*i;
   }  
     return f;
    }
    public static int binCoff(int n,int r){
        int fact_n= fac(n);
        int fact_r=fac(r);
        int fact_nmr=fac(n-r);

        int binCoeff=fact_n/(fact_r*fact_nmr);
        return binCoeff;

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of n:");
        int n=sc.nextInt();
        System.out.print("enter the value of r:");
        int r=sc.nextInt();
        int result = fac(n);
        System.out.println("fac  of n is:"+ result );
        System.out.println(binCoff(n,r));
        sc.close();
    }
    
    
}
 