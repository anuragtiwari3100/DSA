
public class SearchAndRotetedArr {
public static int search(int[]  arr, int tar) {
    int si=0; 
    int ei=arr.length-1;
    while(si<=ei){
      int mid =si+(ei-si)/2;
       if(arr[mid] ==  tar){
          return mid;
       }
       if(arr[si]<= arr[mid]){ //left part is soerted
          if(arr[si]<=tar && tar<=arr[mid]){
                ei= mid-1;
          }else{  
                si =mid+1;
          } 

       }else{   //right part  is sorted
            if(arr[mid]<=arr[ei]){
              if(arr[mid]<=tar &&  tar<=arr[ei]){
                  si =mid+1;
              }else{
                  ei= mid-1;
              }
            }
       }
    }
       return  -1;
  }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
    
        int target = 1;//=>output should be -<4
        int tarIdx = search(arr,target);
    System.out.println(tarIdx);
    }
    
}

