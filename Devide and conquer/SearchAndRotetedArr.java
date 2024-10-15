//pemding
//solves it usinf  a single loop  means suing iteration
public class SearchAndRotetedArr {
  



    public static int SearchInRotatedaArr(int arr[],int tar,int si ,int ei){
        //base Case
        if(si > ei){
            return -1;
        }
        
        //kam is to find out mid
           int mid = si +(ei - si)/2;

           //case found
           if(arr[mid] == tar){
            return mid;

           }

           // mid onL1
           if(arr[si] <= arr[mid]){
            //case:1 =>lefft
            if(arr[si] <= tar &&  tar <= arr[mid]){
                return  SearchInRotatedaArr(arr,tar,si,mid-1);
            }else{
                //case:2=> right
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

