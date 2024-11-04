
    import java.util.Scanner;
    public class Incresing  {
        public static void printIncresingOrder(int n){
            if(n==1){
                System.out.print(n+" ");
                return;
            }
             printIncresingOrder(n-1);
            System.out.print(n+" ");
          
        }
        public static void main(String[] args){
    
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
            int n=sc.nextInt();
            printIncresingOrder(n);
            sc.close();
    
        }
        
    }
    
