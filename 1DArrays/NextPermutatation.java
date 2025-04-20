public class NextPermutatation {

        public void revArr(int arr[], int si, int ei){
            while(si<=ei){
                int temp= arr[si];
                arr[si] = arr[ei];
                arr[ei] = temp;
                si++;
                ei--;
            }
        }
        public void nextPermutation(int[] nums) {
            int n = nums.length;
            int index = -1;
    
            for(int i=n-2; i>=0; i--){
                if(nums[i]<nums[i+1]){
                    index =i;
                    break;
                }
            }
    
            if(index == -1){
                revArr(nums, 0, n-1);
                return;
            }
            for(int j=n-1; j>index; j--){
                if(nums[j]>nums[index]){
                    int temp = nums[j];
                    nums[j] =nums[index];
                    nums[index] = temp;
                    break;
                }
            }
            revArr(nums,index+1, n-1);
            return;
        }
        public static void main(String[] args) {
            System.out.println("JI");
        }
    }

