
class   gfgSelSort {
    
    
    public static  int findmin(int arr[], int i){
        int minpos =i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[minpos] > arr[j]){
                minpos =j;
            }
        }
       return minpos;
    }
    
    public static void selectionSort(int arr[],int n){
        for(int i=0; i<n; i++){
            int minIdx = findmin(arr,i);
        //swap
        int temp = arr[minIdx];
        arr[minIdx] = arr[i];
        arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        System.out.println("Radheshyam..");
        int arr [] ={5,4,3,2,1};
        int n=5;
        selectionSort(arr, n);
                System.out.println("Radheshyam..");

        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}