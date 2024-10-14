public class BInSort {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 8, 5, 4, 3};
        
        // Sort the array
        bubbleSort(arr);

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int key = 3;
        int result = binSearch(arr, key);

        if (result != -1) {
            System.out.println("\nKey " + key + " found at index: " + result);
        } else {
            System.out.println("\nKey " + key + " not found in the array");
        }
    }

    public static int binSearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (end + start) / 2;
            // case.1
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
