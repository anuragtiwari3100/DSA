import java.util.Scanner;


public class LargSmallest {



   // here we'll find the largest and smallest number in an array and resturn an array containing the largest and smallest numbers.
public static int[]  calclateLargestandSmallest(int arr[]){
   int max = Integer.MIN_VALUE;
   int min = Integer.MAX_VALUE;
   for(int i=0; i<arr.length; i++){
         if(arr[i]>max){
            max = arr[i];
         }
         if(arr[i]<min){
            min = arr[i];
         }
   }
   return new int[]{max,min};
}



   public static int getlargest(int numbers[]) {
      int largest = Integer.MIN_VALUE;// -infinity
      int smallest = Integer.MAX_VALUE;// +infinity

      if (numbers == null || numbers.length == 0) {
         throw new IllegalArgumentException("Array must not be null or empty");
      }
      
      for (int i = 0; i < numbers.length; i++) {
         if (largest < numbers[i]) {
            largest = numbers[i];
         }
         if (smallest > numbers[i]) {
            smallest = numbers[i];
         }
      }
      System.out.println("Smallest vlue is:" + smallest); // ---> b/c function can retsurn a sinhle value at a time                                                      // that's why either we can print it with in the same function                                                       // or we can create a separate one
      return largest;
   }


      public static int getsmallest(int numbers[]) {
         if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
         }
         int smallest = Integer.MAX_VALUE;// +infinity
         for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
               smallest = numbers[i];
            }
         }
         return smallest;
      }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // int numbers[]=new int[10];
      int numbers[] = { 4, 5, 6, -7, -8, -3, -2 };
    
      int res = getlargest(numbers);
      System.out.println("Largest number  among all eneterned number is " + res);

      
      sc.close();
   }
}
    