import java.util.Scanner;
import java.lang.System;
public class BinarySerch {
    public static int  Dundho(int numbers[],int key){      
        int start=0,  end=numbers.length-1;
        
        while(start<=end){
           int mid=(start+end)/2;
   


            /*
                 // Reverse order means:
 if (numbers[mid] > key) { // Search in the right half
  start = mid + 1;
} else { // Search in the left half
  end = mid - 1;
}
            */

           if(numbers[mid]==key){  //found 
                     return mid;
           }
           if(numbers[mid]<key){  //right half
            start=mid+1;
           }
           else{    //left half
               end=mid-1;
           }
        }
       
        return -1;
    }
     public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int numbers[]=new int[10];
      System.out.println("enter  the  ten nubers:");
      for(int i=0;i<numbers.length;i++){
        numbers[i]=sc.nextInt();
      }
      System.out.println("enter your key that you want to search:");
         int key=sc.nextInt();
       int res=  Dundho(numbers,key);
         System.out.println("index not found and index for key is:"+res);
         sc.close();
     }
    
}
