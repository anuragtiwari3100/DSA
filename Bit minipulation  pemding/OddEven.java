import java.util.Scanner;
public class OddEven {
    public static  int oddOrEven(int n){
         int bitMask=1;
         if((n & bitMask)==0){
           //even number
           System.out.println("even number:");
         }else {
            System.out.println("odd number");
         }
         return 0;
    }
    public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
          System.out.println("enter your number");
          int number=sc.nextInt();
        //   int res=oddOrEven(number);
         System.out.println(oddOrEven(number));
         sc.close();
    }
    
}
