//pemding
//solves it usinf  a single loop  means suing iteration
public class SearchAndRotetedArr {
  


//doubt is ther

//solves it usinf  a single loop  means suing iteration


    public static int SearchInRotatedaArr(int arr[],int tar,int si ,int ei){
        //base Case
        if(si >= ei){
            return -1;
        }
        
        //kam is to find out mid
           int mid = si +(ei - si)/2;

           //case found
           if(arr[mid] == tar){
            return mid;
           }

           // mid on L1
           if(arr[si] <= arr[mid]){
            //case:a =>lefft
            if(arr[si] <= tar &&  tar <= arr[mid]){
                return  SearchInRotatedaArr(arr,tar,si,mid-1);
            }else{
                //case:b=> right
               return  SearchInRotatedaArr(arr,tar,mid+1,ei);
            }

           }
           //Mid on L2
           else{
            //case :C :left
            if(arr[mid] <= tar && tar <= arr[ei]){
                return SearchInRotatedaArr(arr,tar,mid+1,ei);
            }else{
                //case:d =>left
                return SearchInRotatedaArr(arr,tar,si,mid-1);
            }
             
           }
    }
    public static void main(String[] args) {
        int arr[] ={4,5,6,7,0,1,2};
        int target = 0;//=>output should be -<4
        int tarIdx = SearchInRotatedaArr(arr,target,0,arr.length-1);
    System.out.println(tarIdx);
    }
    
}



/*
 

class Solution {
    public int search(int[]  arr, int tar) {
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
                  si = mid+1;
            } 

         }else{   //right part  is sorted
              if(arr[mid]<=arr[ei]){
                if(arr[mid]<=tar &&  tar<=arr[ei]){
                    si =si+1;
                }else{
                    ei= mid-1;
                }
              }
         }
      }
         return  -1;
    }
    }

       


 */