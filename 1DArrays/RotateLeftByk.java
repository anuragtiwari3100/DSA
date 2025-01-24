public class RotateLeftByk {
    //Apraoch1=>T.C =>O(n) and Sc = O(n)
    public static  void rotateLeftArr(int arr[],int k){
        int n = arr.length;
           k = k%n;
        int temp[] = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
           temp[(i + n - k) % n] = arr[i];
        }

        for(int i=0; i<arr.length; i++){
            arr[i] = temp[i];
        }
        
        printArr(arr);
       }
       public static void  printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }


    public void rev(int arr[], int si, int ei) {
        while (si < ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    
    public void rotateLeft2(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 
     
         rev(nums, 0, k - 1);
        
        rev(nums, k, n - 1);
        
        rev(nums, 0, n - 1);
    }
    


    public static void main(String[] args) {
    int arr[] = new int[]{1,2,3,4,5};
    rotateLeftArr(arr,2);
    }
}
