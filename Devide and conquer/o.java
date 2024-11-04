
class o {
    public static int cal(int arr[],int target){
              for(int i=0; i<arr.length; i++){
            if(arr[i]== target){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println("welcome");
        int arr[] ={5,4,2,0,5,2};
        int target =0;
  int res =cal(arr,target);
  System.out.println(res);
        
    }
}