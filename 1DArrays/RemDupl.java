import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemDupl {

    public static int removeDuplicate(int arr[]) {
        Set<Integer> s = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
             int  k =s.size();                   
                        /*
                                  int index = 0;
                                for (int num : s) {
                                    arr[index++] = num;
                                }
                         */
        
                                Iterator<Integer> iterator = s.iterator();
                                for (int idx = 0; iterator.hasNext(); idx++) {
                                    int x = iterator.next();
                                    arr[idx] = x; // Copy the value to the array at the current index
                                }

        return k; 
    }

    public static int removeDuplicate2(int arr[]){
        int i=0;
        for(int j=1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    // Method to print the array
    public static void printArr(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 5};
        int newSize = removeDuplicate2(arr);
        printArr(arr, newSize);
    }
}