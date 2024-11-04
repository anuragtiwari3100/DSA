import java.util.Scanner;

public class Quick{
    public static void printArr(int arr[]){
        System.out.println("Elements  in linear fashion are:");
           for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
        }
        System.out.println();
      }


      public static void quickSort(int arr[],int si,int ei){
         if(si>=ei){
            return;
         }
    int pIdx=partion(arr,si,ei);
         quickSort(arr,si,pIdx-1);//left
        quickSort(arr,pIdx+1,ei);//left

      }
      
      public static int partion(int arr[],int si,int ei){
    int Pivot=arr[ei];  
    int i=si-1;//to make place for elements smaller than pivot
     for(int j=si;j<ei;j++){
      if(arr[j]<=Pivot){
         i++;
         //swap
         int temp=arr[j];
         arr[j]=arr[i];
         arr[i]=temp;
      }
      }  
      i++;
      //i islie use hua kyki at the end hame pivot ko uski right position pe daalna 
        int temp=Pivot;
         arr[ei]=arr[i];//pivot is just a variable holding the value of the pivot, not its position in the array.
        // You need to swap values in the array (which involves changing the actual array elements), not just the variable pivot.
        
        arr[i]=temp;
         return i;
     
      }

      
     public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size that you want:");
        int n=sc.nextInt();
        int arr[]=new int[n];

System.out.print("enter the value of Array having size of "+n+" ");
   for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
   }
   System.out.print("enter the Starting index:");
   int si=sc.nextInt();
    
   int ei=arr.length-1;
   //ei = arr.lenggth-1; always

   quickSort(arr,si,ei);
printArr(arr);
sc.close();
     }
}
