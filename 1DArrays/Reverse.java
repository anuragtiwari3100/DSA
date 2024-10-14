import java.util.Scanner;
public class Reverse {
    public static void reversing(int numbers[]){
      int first=0,last=numbers.length-1;

      while(first<last){
        //swap
        int temp=numbers[last];
        numbers[last]=numbers[first];
        numbers[first]=temp;

        first++;
        last--;
      }
    }
     public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     int  numbers[]=new int[10];
     System.out.println("Enter you value of your array:");
     for(int i=0;i<numbers.length;i++){
        numbers[i]=sc.nextInt();
     }
     reversing(numbers);
     for(int i=0;i<numbers.length;i++){
          System.out.print(numbers[i]+" ");
     }
     System.out.println();
     sc.close();
     }    
}
