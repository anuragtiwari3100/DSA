
public class Factorial {
    public static int Findingfact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=Findingfact(n-1);
        int fn=n*fnm1;
        return fn;
    }



   public static void  printNo(int n){
     if(n<1){
        return;
     }
     System.out.print(n+" ");
     printNo(n-1);
     
   }

     public static void  printNo2(int n){
     if(n<1){
        return;
     }
  
     printNo(n-1);
        System.out.print(n+" ");
     
   }
 

    public static void main(String[] args){
    //  Scanner sc=new Scanner(System.in);
    //         System.out.println("Enter the number");
    //         int n=sc.nextInt();
    //         System.out.println ("Factorial of enterned number is:"+Findingfact(n));
    //         sc.close();

    printNo(10);
    printNo2(10);
}
}
