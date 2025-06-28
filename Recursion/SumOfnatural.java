import java.util.Scanner;

public class SumOfnatural {
    public static int  calcSum(int n){
        if(n==1){
            return 1;
      }
    int sumNm1=calcSum(n-1);
    int Sn=n+sumNm1;
       return Sn;
    }
     public static void main(String[] args){
    
            Scanner sc=new Scanner(System.in);  
            System.out.println("Enter the number");
            int n=sc.nextInt();
            System.out.println("Sum of n natural number is :"+calcSum(n) );
            sc.close();
}
}