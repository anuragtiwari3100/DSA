import java.util.Scanner;
public class LargSmallest {
    public static int getlargest(int numbers[]){
               int largest=Integer.MIN_VALUE;//-infinity
               int smallest=Integer.MAX_VALUE;//+infinity
               for(int i=0; i<numbers.length; i++){
                     if(largest<numbers[i]){
                        largest=numbers[i];
                     }
                     if(smallest>numbers[i]){
                        smallest=numbers[i];
                     }
               }
              System.out.println("Smallest vlue is:"+smallest); //---> b/c function can retsurn a sinhle value at a time that's why either we can  print it with in the same function or we can create a separate one

               return largest;
    }  
   //   public static int getsmallest(int numbers[]){ 
   //       int smallest=Integer.MAX_VALUE;//+infinity
   //         for(int i=0; i<numbers.length; i++){
   //           if(smallest>numbers[i]){
   //                      smallest=numbers[i];
   //                   }
                  
   //          }
   //             return  smallest;
   //      }
    public static  void main(String[]args){
   Scanner sc=new Scanner(System.in);
    int numbers[]=new int[10];
    System.out.print("Enter your 10 numbers:");
    for(int i=0;i<numbers.length ;i++){
          numbers[i]=sc.nextInt();
    }   
   int res=getlargest(numbers);
   System.out.println("Largest number  among all eneterned number is "+res);
   

    sc.close();
}
}
