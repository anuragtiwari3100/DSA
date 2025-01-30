import java.util.ArrayList;
public class moveZerosToRight {

    //Aproach1.
    public static void moveZero(int arr[]){
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
         if(arr[i] != 0){
            list.add(arr[i]);
         }
        }

       int k = list.size();
       for(int i=0; i<k; i++){
        arr[i] = list.get(i);
       }
    

       for(int j=k; j<arr.length; j++){
          arr[j] = 0;
       }
       prinArr(arr);
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
    }
    
    public static void moveZero2(int arr[]){
      int j=-1;
      for(int i=0; i<arr.length; i++){
        if(arr[i] == 0){
            j=i;
            break;
        }
      }

      for(int i=j+1; i<arr.length; i++){
        if(arr[i] !=0){
            swap(arr,i,j);
            j++;
        }
      }
      prinArr(arr);
    }
    public static void prinArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.err.print(arr[i]+" ");
        }
    }

    
    public static void main(String[] args){
        System.out.println("Move zero");
        int arr[] = new int[]{1,0,0,5,8,9,4,0};
        moveZero2(arr);
      
    }
    
}
