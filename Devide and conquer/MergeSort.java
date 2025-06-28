import java.util.Scanner;

public class MergeSort {


public static void printArr(int arr[]){
      System.out.println("Elements  in linear fashion are:");
         for(int i=0;i<arr.length;i++){
              System.out.print(+arr[i]+" ");
      }
      System.out.println();
    }


    public static void mergeSort(int arr[],int si,int ei){  //->recursive function
        if(si>=ei){
              return ;
        }
        //kam
           int mid = si+(ei-si)/2;  //->Similar to mid=(si+ei)/2
           mergeSort(arr,si,mid); //left part
           mergeSort(arr,mid+1,ei); //right part
           Merge(arr,si,mid,ei);   
    } 
 
    public static void  Merge(int arr[], int si, int mid, int ei){ 
        // for for finding the size of  temp arr=>left(0,3)=4,Right(4,6)=3 then size =ei-si+1=>6-0+1=7
       int temp[] = new int[ei - si + 1];
       int i = si; // iterator for left part
       int j = mid + 1; // iterator for right part
       int k = 0; // iterator for temp arr
   
       while (i <= mid && j <= ei) {
           if (arr[i] < arr[j]) { //arr[i]=>element of left part and arr[j]=>element of right part
               temp[k] = arr[i];
               i++;
           //k++; -> out of else block me ekbar hi kar diya

           } else {
               temp[k] = arr[j];
               j++;
                    //k++; -> out of else block me ekbar hi kar diya

           }
           k++;
       }
   
       // left part
       while (i <= mid) {
           temp[k++] = arr[i++];
       }  
       // right part
       while (j <= ei) {
           temp[k++] = arr[j++];
       }
   
       // copying temp[] to original array
       for (k = 0, i = si; k < temp.length; k++, i++) {
           arr[i] = temp[k];
       }
   }



     
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size that you want:");
        int n=sc.nextInt();
        int arr[]=new int[n];

System.out.print("enter the value of Array having size of "+n+" ");
   for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
   }
   System.out.print("enter the Starting index:");
   int si=sc.nextInt();
    System.out.print("enter the Ending index:");
   int ei=sc.nextInt();
   mergeSort(arr,si,ei);
    printArr(arr); 
/*   we dont want to take input during comiple time
  int arr[]={6,3,9,5,2,8};
   mergeSort(arr,0,arr.length-1);
     printArr(arr);  */
     sc.close();

     

    }
}



/*
 
For the input [6, 3, 9, 5, 2, 8], you could visualize the call stack as:

scss
Copy code

|-------------------------------|
| mergeSort(arr, 0, 5)           | <- Top of the stack
|-------------------------------|
| mergeSort(arr, 0, 2)           | 
|-------------------------------|
| mergeSort(arr, 0, 1)           | 
|-------------------------------|
| mergeSort(arr, 0, 0)           | <- Base case reached
|-------------------------------|
| mergeSort(arr, 1, 1)           | <- Base case reached
|-------------------------------|
| mergeSort(arr, 2, 2)           | <- Base case reached
|-------------------------------|
| mergeSort(arr, 3, 5)           |
|-------------------------------|
| mergeSort(arr, 3, 4)           |
|-------------------------------|
| mergeSort(arr, 3, 3)           | <- Base case reached
|-------------------------------|
| mergeSort(arr, 4, 4)           | <- Base case reached
|-------------------------------|
| mergeSort(arr, 5, 5)           | <- Base case reached
|-------------------------------|

 */