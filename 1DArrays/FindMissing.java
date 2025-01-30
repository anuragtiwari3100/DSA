public class FindMissing {
   
        public static  int missingNumber1(int[] nums) {
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
    
    public static  int missingNumber(int[] nums) {
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

     public static int  missingNo2(int arr[]){
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
     public static  void main(String args[]){
        int arr[] ={1,3};
        int res = missingNo2(arr);
        System.err.println("res is  "+res);
     }
    
}
