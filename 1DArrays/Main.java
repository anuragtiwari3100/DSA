import java.util.*;
public class Main {
public static  List<Integer> nextGreaterPermutation(List<Integer> A){
      int n = A.size();
      int index=-1;
      for(int i=n-2; i>=0; i--){
          if(A.get(i)<A.get(i+1)){
             index=i; 
             break;
          }
      }
      if(index ==-1){
          Collections.reverse(A);
          return A;
      }
      for(int j=n-1; j>=index; j--){
          if(A.get(j)>A.get(index)){
              int temp =A.get(j);
              A.set(j,A.get(index));
              A.set(index,temp);
              break;
          }
      }
       List<Integer> myList= A.subList(index+1,n);
       Collections.reverse(myList);
       return A;
  }
  
  public static int[] nextGreaterPermutation(int[] A) {
    int n = A.length;
    int index = -1;

    // Step 1: Find the first decreasing element from the right
    for (int i = n - 2; i >= 0; i--) {
        if (A[i] < A[i + 1]) {
            index = i;
            break;
        }
    }

    // Step 2: If no such element, reverse the array (it's the last permutation)
    if (index == -1) {
        reverse(A, 0, n - 1);
        return A;
    }

    // Step 3: Find the next greater element from the right
    for (int j = n - 1; j > index; j--) {
        if (A[j] > A[index]) {
            int temp = A[j];
            A[j] = A[index];
            A[index] = temp;
            break;
        }
    }

    // Step 4: Reverse the part after index
    reverse(A, index + 1, n - 1);

    return A;
}

// Helper function to reverse part of the array
public static void reverse(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
    public static void main(String[] args) {
   List<Integer> A= Arrays.asList(new Integer[]{1,2,3,6,5,4});
   List<Integer> ans = nextGreaterPermutation(A);
   System.out.println("The nexr Permutation is :[");
   for(int i=0; i<ans.size(); i++){
       System.out.print(ans.get(i)+",");
   }
   System.out.print("]");
    }
}