import java.util.Scanner;
public class factorial {
    public static int  fac(int n){
   int f=1;
   for(int i=1;i<=n;i++){
       f=f*i;
   }  
     return f; // factorial of n
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int result = fac(n);
        System.out.println("fac is:"+ result );
      sc.close(); 
    }
    
}
