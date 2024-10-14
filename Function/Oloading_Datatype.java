import java.util.Scanner;

//function to calculate integer sum
public class Oloading_Datatype {
    public static int Sum(int a,int b){
        int res=a+b;
        return res;
    }

     // function to calculae float sum
    public static  float  Sum(float a,float b,float c){
        float res=a+b+c;
        return res;
    }
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the value of a:");
            float a=sc.nextFloat();
            System.out.print("enter the value of b:");
           float b=sc.nextFloat(); 
           System.out.print("enter the value of c:");
           float c=sc.nextFloat();   
           int res = Sum((int) a, (int) b); // here  we are taking input in float for we have to explicit type cast  it because it is noe possible to  convert a bigger data into smaller one 
           System.out.println("Sum of two enterned  no a and b=  "+res);
          float Add = Sum(a,b,c);
             System.out.println("Sum of  three enterned  no a, b and c=  "+Add);
            sc.close();

    }    
}
 