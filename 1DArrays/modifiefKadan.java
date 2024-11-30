public class modifiefKadan {
        public static int KanadAlgo(int arr[]){
            int cs =0; 
            int ms= Integer.MIN_VALUE;
            boolean hasPositive = false;
            
            
            for(int i=0; i<arr.length; i++){
                cs = cs+arr[i];
                if(cs <1){
                    cs =0;
                }
                ms =Math.max(cs,ms);
                if(arr[i]>0){
                    hasPositive =  true;
                }
            }
// If hasPositive == false (i.e., there are no positive numbers in the array), !hasPositive becomes true, and the block inside the if runs.
              if(!hasPositive){   // for all negative numbers
                    int smallestNegative =Integer.MIN_VALUE;
                    for(int i=0; i<arr.length; i++){
                        if(arr[i]<0){
                            smallestNegative = Math.max(smallestNegative,arr[i]);
                        }
                    }
                    return smallestNegative;
              }
         return  ms;
        }
        public static void main(String[] args) {
            int numbers[] = {-2, -3, -4, -1, -5}; 
            int ans = KanadAlgo(numbers);
            System.out.println(ans);
        }
    }