import java.util.Scanner;
public class Product {
        public static int product(int x,int y){
        int prod=x*y;
         return prod;
    }   
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
           System.out.print("enter the value of a:");
      int a=sc.nextInt();
            System.out.print("enter the value of b:");
      int b=sc.nextInt();  
        int res=product(a,b);
        System.out.println("Result is:"+res); 
        sc.close();
    }
    
}





