import java.util.HashSet;
import java.util.Set;

public class RemDupl {

    public static int removeDuplicate(int arr[]) {
        Set<Integer> s = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
        
        int index = 0;
        for (int num : s) {
            arr[index++] = num;
        }
        
        return index; 
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
        int newSize = removeDuplicate(arr);
        printArr(arr, newSize);
    }
}