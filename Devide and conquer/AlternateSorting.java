import java.util.*;
public class AlternateSorting {

      // Method for sorting in Ascending Order
      public static List<Integer> sortAscending(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        sortedList.sort((a, b) -> a - b);
        return sortedList;
    }

    // Method for sorting in Descending Order
    public static List<Integer> sortDescending(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        sortedList.sort((a, b) -> b - a);
        return sortedList;
    }

    // Method for sorting based on the number of digits
    public static List<Integer> sortByLength(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        sortedList.sort((a, b) -> String.valueOf(a).length() - String.valueOf(b).length());
        return sortedList;
    }

    // Method for sorting based on the last digit
    public static List<Integer> sortByLastDigit(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        sortedList.sort((a, b) -> (a % 10) - (b % 10));
        return sortedList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(123, 45, 7, 8901, 56);

        System.out.println("Original List: " + numbers);
        
        System.out.println("Ascending Order: " + sortAscending(numbers));
        System.out.println("Descending Order: " + sortDescending(numbers));
        System.out.println("Sorted by Number of Digits: " + sortByLength(numbers));
        System.out.println("Sorted by Last Digit: " + sortByLastDigit(numbers));
    }
}

    
