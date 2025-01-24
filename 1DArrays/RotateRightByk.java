//  Rotating by ride side 
  //Approach2 
public class RotateRightByk{
  
   public static void rotateRightByk(int arr[],int k){
      int n = arr.length;
      int tempArr[] = new int[n];
      for(int i=0; i<arr.length; i++){
         tempArr[(i+k)%n] =arr[i];
      }
      /*
         for(int i=0; i<tempArr.length; i++){
         arr[i] = tempArr[i];
      } 
       
       */
       System.arraycopy(tempArr, 0, arr, 0, tempArr.length);
   }
   
  //Approach2 
public static  void  rotateRightByk2(int arr[] ,int k){
       
      int n= arr.length;
       k = k%n; // To handle cases where k is greater than n
       reverse(arr,0,n-1);
       reverse(arr,0,k-1);
       reverse(arr,k,n-1);

       printArr(arr);
   }


 public static  void  reverse(int arr[],int si, int ei){
            while(si<=ei){
               int temp = arr[si];
               arr[si] = arr[ei];
               arr[ei] =  temp;
            }
   }


public static boolean  isRotated(int arr[]){
   int count =0;
   int n = arr.length;
   for(int i=1; i<n; i++){
       if(arr[i-1] > arr[i]){
         count ++;
       }
   }
   if(arr[n-1]>arr[0]){
      count++;
    }

   return  count == 1;
}


  public static void printArr(int arr[]){
   for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
   }
  }
 
  public static void main(String args[]){
       int arr[] = new int[]{1,2,3,4,5};
       int k=2 ; //indicating the posit by whihc we have to rotate
      //  printArr(arr);
      //  rotate(arr,k);
       System.err.println("");
      //  printArr(arr);
      printArr(arr);
      System.out.println(isRotated(arr));
   }

}