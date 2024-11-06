
class Selection2 {
    public static int select(int arr[] , int i){
          int minPoss = i;
          for(int j =i+1; j<arr.length; j++){
               if(arr[minPoss] > arr[j]){
                   minPoss = j;
               }
          }
           return minPoss;
    }
  
   public static void selectionSort(int arr[], int n){
        for(int i=0; i<n-1; i++){
              int minPos = select(arr, i);
              int temp = arr[minPos];
              arr[minPos] = arr[i];
              arr[i] = temp;
        }
   }
   
   public static void printArr(int arr[]){
         for(int i=0; i<arr.length; i++){
             System.out.println(arr[i]);
         }
   }
  public static void main(String[] args) {
          long startTime = System.nanoTime();
      System.out.println("Before sorting");
      int arr[] ={5,4,3,2,1};
      int n = arr.length;
      printArr(arr);
      selectionSort(arr,n);
      System.out.println("After sorting");
      printArr(arr);
long endTime = System.nanoTime();
   long duration = (endTime - startTime); 
   System.out.println("the total time taken to Sort the elements of array is"+duration);
 
  }
  


}