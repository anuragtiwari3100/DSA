import java.util.Scanner;

public class LinearSerch {
    public static int linsearch(int numbers[], int key){
     for(int i=0;i<numbers.length;i++){
        if(numbers[i]==key){
            return i;
        }
     }
     return -1;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int numbers[]=new int[10];
        
      System.out.println("Enter  your 10 input as anumber:");
      for(int i=0;i<numbers.length;i++){
        numbers[i]=sc.nextInt();
      }
      System.out.println("Please enter your key that you want to search:");
      int key=sc.nextInt();
   
       int index=linsearch(numbers,key);
       if(index==-1){
        System.out.println("Sorry ! but enterned key does not found,please try again:");
       }else{
             System.out.println(" your key found at index:"+index);
       }
         sc.close();
    }
   
}
