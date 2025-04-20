import java.util.Scanner;

public class MergeSort2 {
    public static  void mergeSort(int arr[]){
        mergeSort(arr, int si, int ei);
    }
 
    public static void mergeSort(int arr[], int si, int ei){
          if(si>=ei){
            return;
          }
          int mid = si+(ei-si)/2;
          mergeSort(arr,si,mid);
          mergeSort(arr,mid+1,ei);
          merge(arr,si,mid,ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
      int resArr[] = new int[ei-si+1];
      int i=si;
      int j = mid+1;
       int k=0;
       while(i<=mid && j<=ei){
        if(arr[i]<arr[j]){
          resArr[k]= arr[i];
          i++;
        }else{
          resArr[k] = arr[j];
          j++;
        }
        k++;
       }
       while(i<=mid){
        resArr[k++]= arr[i++];
       }
       while(j<=ei){
        resArr[k++]= arr[j++];
       }
     for( k=0 ,i =si ; k<resArr.length-1; k++, i++){
      arr[i++] = resArr[k];
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
   mergeSort(arr);
    // printArr(arr); 
/*   we dont want to take input during comiple time
  int arr[]={6,3,9,5,2,8};
   mergeSort(arr,0,arr.length-1);
     printArr(arr);  */
     sc.close();

     

    }
    
}
