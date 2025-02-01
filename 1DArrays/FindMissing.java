public class FindMissing {
   
        public static  int missingNumber1(int[] nums) {  // TC  => O(n^2)  && SC = O(n)
           int  N = nums.length+1;
           for(int i=1; i<=N; i++){
            int flag =0;
            for(int j=0; j<nums.length; j++){
                if(nums[j] == i){
                    flag =1;
                    break;
                }
            }
            if(flag == 0){
               return i; 
            }
           }
           return -1;
        }
    
    public static  int misssingNumber1(int[] nums) {  // TC  => O(n^2)  && SC = O(n)
        int  N = nums.length+1;
        for(int i=1; i<=N; i++){
         int flag =0;
         for(int j=0; j<=nums.length-1; j++){
             if(nums[j] == i){
                 flag =1;
                 break;
             }
         }
         if(flag == 0){
            return i; 
         }
        }
        return -1;
     }



     public static int  missingNo2(int arr[]){    // TC  => O(n)  && SC = O(n)
      int  hash[] = new int[arr.length+1];
        for(int i=0; i<arr.length-1; i++){
            hash[arr[i]]++;
        }
        for(int j=1; j<hash.length; j++){
            if(hash[j] ==0){
                return   j;
            }
        }
        return  -1;
     }


     //optimal but also try with XOR
     public static int missingNo3(int arr[]){   //TC => O(n) && SC = O(1)
         int N = arr.length+1;    //  we know size  will currSize+1
         int sum = (N*(N+1))/2;
         int tempSum=0;
         for(int i=0; i<arr.length; i++){
            tempSum += arr[i];
         }
         return  sum-tempSum;
     }
    
     public static  void main(String args[]){
        int arr[] ={4,3,1};
        int res = misssingNumber1(arr);
        System.err.println("res is  "+res);
     }
    
}
