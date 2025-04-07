public class Dutch_nationa_flag {

        public void swap(int nums[], int low, int mid){
        int temp = nums[low];
        nums[low]=nums[mid];
        nums[mid]=temp;

        // nums[low] = nums[low] + nums[mid];  
        // nums[mid] = nums[low] - nums[mid];
        // nums[low] = nums[low] - nums[mid];
    }

    public void sortColors(int[] nums) {

/**
                                                    int cnt0=0;
                                    int cnt1=0;
                                    int cnt2=0;
                                    for(int i=0; i<nums.length; i++){
                                        if(nums[i] == 0){
                                            cnt0++;
                                        }else if(nums[i] == 1){
                                            cnt1++;
                                        }else{
                                            cnt2++;
                                        }
                                    }
                                    for(int i=0; i<cnt0; i++){
                                        nums[i] =0;
                                    }
                                    for(int j=cnt0; j<cnt1+cnt0; j++){
                                        nums[j] = 1;
                                    }
                                    for(int k=cnt0+cnt1; k<nums.length; k++){
                                        nums[k]=2;
                                    }
 */

   int low =0, mid =0, high=nums.length-1;
     while(mid <=high){
        if(nums[mid] == 0){
            swap(nums,low,mid);
            low ++;
            mid++;
        }else if(nums[mid] == 1){
            mid++;
              
        }else{
            swap(nums,mid,high);
            high--;
       
        }
     }

    }
}
    
