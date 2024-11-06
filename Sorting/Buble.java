import java.util.Scanner;
 public class Buble{
    public static void Bubble(int arr[]) {
        int totalSwaps = 0; // Variable to count total swaps
        for (int i = 0; i < arr.length; i++) {
            int swapsInPass = 0; // Variable to count swaps in current pass
            boolean swapped = false; // Flag to track if any swaps were made
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapsInPass++;
                    swapped = true; // Set flag to true if a swap occurs
                }
            }
            totalSwaps = +swapsInPass;
            if (!swapped) // If no swaps were made, array is already sorted, so break the loop
                break;
            System.out.println("Swaps in pass " + (i + 1) + ": " + swapsInPass);
        }
        System.out.println("Total swaps: " + totalSwaps);
    }

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Bubble(arr);
        System.out.println("Sorted array:");
        PrintArr(arr);
        sc.close();
    }
}

