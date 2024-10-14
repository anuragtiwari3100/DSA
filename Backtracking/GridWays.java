//O(2^n+m)->exponential time com-lexity
import java.util.Scanner;
public class GridWays {
    public static int findways(int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){//con for last cell
            return 1;

        }else if(i==n||j==n){ //condition for boundry cross  
            return 0;
        }
        int w1=findways(i+1,j,m,n);
        int w2=findways(i,j+1,m,n);

        return w1+w2;
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the value of row:");
       int m=sc.nextInt();
        System.out.print("Enter the value of column:");
        int n=sc.nextInt();
        System.out.println(findways(0,0,n,m));
    sc.close();
    }
    
}
