// not from this folder
public class optimizeBbubbleSort { 
    public static void main(String[] args) {
        int arr[] = {3, 1, 2}; // Unsorted array
        modifiedBubbleSort(arr);

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void modifiedBubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped==false) {
                break;
            }
        }
    }
}
