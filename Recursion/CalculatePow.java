import java.util.Scanner;
public class CalculatePow {
     public static int Calcexponent(int x,int n){
          if(n==0){
            return 1;
          }
       /*
        int xnm1=Calcexponent(x,n-1);
       int xn=xnm1*x;
       return xn;
       */
    return x*Calcexponent(x,n-1);
     }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base:");
        int x=sc.nextInt();
        System.out.print("Enter the power:");
        int n=sc.nextInt();
       System.out.println("Exponent of given  number is:"+Calcexponent(x,n));
       sc.close();
     
    }
    
}
