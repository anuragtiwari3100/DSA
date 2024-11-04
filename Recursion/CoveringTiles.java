import java.util.Scanner;
public class CoveringTiles {
    public static int tillingProblem(int n){
        //base case
        if(n==0|| n==1){
            return 1;
        }
         //kam->to chose choice viryocally or horrizontaly
         //choice1->vertically
         int fnm1=tillingProblem(n-1);
         //choice2->horizontly
        int fnm2=tillingProblem(n-2);
         
        int TotWays=fnm1+fnm2;
        return TotWays;
    }
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter nummber");
int n=sc.nextInt();
System.out.println(tillingProblem(n));
sc.close();
    }
    
}
