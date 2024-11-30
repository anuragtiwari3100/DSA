//this code won't  work where all elements are -ve
//  for this arr [-1,-2,-3,-4] => Answer  it will  give  0 but should be  -1 so write cases for that i.e HW
import java.util.Scanner;
public class kanadAlgo {
    public static  int kadad(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
      return ms;
    }
    public static  void main(String[] args){
        // int numbers[]={-2,-3,4,-1,1,-2,1,5,-3};
        Scanner sc=new Scanner(System.in);
        int numbers[]=new int[9];
        System.out.println("Enter your Array having size of 9:");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
       
    int  ms=  kadad(numbers);
           System.out.println("Sum of our max subArray is:"+ms);
       sc.close();
    }
    
}
