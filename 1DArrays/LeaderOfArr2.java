public class LeaderOfArr2 {

    /**
     * 1299
     Input: arr = [17,18,5,4,6,1]
    Output: [18,6,6,6,1,-1]
     */
    public static int[] replacemnt(int arr[]){
        int n = arr.length;
        int  max = -1;
        int rerArr[] = new int[arr.length];
        for(int i=n-1; i>=0; i--){
            rerArr[i] = max;
            max= Math.max(arr[i],max);
        }
        return rerArr;
    }
    public static void main(String [] args){
        int arr[] ={17,18,5,4,6,1};
        replacemnt(arr);

    }
    
}
