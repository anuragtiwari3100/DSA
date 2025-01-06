import java.util.ArrayList;
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


    public static void  revSubArr(int arr[],int si, int ei){
      while(si<ei){
            int temp=arr[ei];
            arr[ei]=arr[si];
            arr[si]=temp;
            si++;
            ei--;
        }
    }




    public static void reverseArray(ArrayList<Integer> arr, int m) {
        // Starting index is m + 1, ending index is arr.size() - 1
        int si = m;
        int ei = arr.size() - 1;
        
        // Reverse elements between indices si and ei
        while (si < ei) {
            // Swap elements at si and ei
            int temp = arr.get(ei);
            arr.set(ei, arr.get(si));
            arr.set(si, temp);
            
            // Move si forward and ei backward
            si++;
            ei--;
        }
    }


     public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
    //  int  numbers[]=new int[10];
    int  numbers[] ={1,2,4,5,6,7};
    //  System.out.println("Enter you value of your array:");
    //  for(int i=0;i<numbers.length;i++){
    //     numbers[i]=sc.nextInt();
    //  }
    //  reversing(numbers);
    //  revSubArr(numbers,2,4);
//     for(int i=0;i<numbers.length;i++){
//       System.out.print(numbers[i]+" ");
//  }
 
    ArrayList<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      System.out.println("Before  reversing the  list");
      for(int x:list){
        System.out.  println(x);
      }
      reverseArray(list,0);
      System.out.println("After reversing the list");
      for(int x :list){
        System.out.println(x);
      }
   
     System.out.println();
     sc.close();
     }    
}




