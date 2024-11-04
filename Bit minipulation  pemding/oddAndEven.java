public class oddAndEven {





    public static  void oddAndEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("The number that you have enterned is odd");
        }
    }
public static void   main(String args[]){
    oddAndEven(9);
}
    
}
