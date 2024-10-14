import java.lang.String;
import  java.util.Scanner;
public class Sum {
    public static int calculateSum(int num1,int num2){  //parameters or formal parametrs => the task of this parametes is to just value  from main function  we can named of these paramers as we wish
      int sum=num1+num2;
      return sum;
    }
public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   int x= sc.nextInt();
   int y=sc.nextInt();
   int sum= calculateSum(x,y);   //arguments or actual parameters
   System.out.println("sum of two number is:"+sum);
   sc.close();
} 
 } 

    

 