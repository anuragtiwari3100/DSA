import java.util.Scanner;
public class Oloading_params {

    //this is the function to calculate sum of two number
    public static int Sum(int a,int b){
        int res=a+b;
        return res;
    }
        //this is the function to calculate sum of   three number
    public static  int  Sum(int a,int b,int c){
        int res=a+b+c;
        return res;
    }
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the value of a:");
            int a=sc.nextInt();
            System.out.print("enter the value of b:");
            int b=sc.nextInt();
           System.out.print("enter the value of c:");
            int c=sc.nextInt();
          int res=  Sum(a,b);
                       System.out.println("Sum of two enterned  no a and b=  "+res);
          int Add = Sum(a,b,c);
             System.out.println("Sum of  three enterned  no a, b and c=  "+Add);
            sc.close();

    }   
    
}
