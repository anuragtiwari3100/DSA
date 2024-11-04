public class Counting {


    //arr = [1, 4, 3, 2, 4, 3, 7]



     //This   function is responsible for finding the largest  elementin the array by   comparing the  nest element of the arraywith the   current Largest
    public static void countingSort(int arr[]){  
        int largest=Integer.MIN_VALUE;   //  it refers to the mmin value liike minus infinity
        for(int i=0; i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }


        int count[]=new int[largest+1];    // we have to   store the frequncy and for maximmimm value  like we have 7 and to store that we would have need size of 8 i.e
        for(int i=0; i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting
        // count = [0, 2, 1, 2, 2, 0, 0, 1]
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        } 
    }


    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
        }
  }
public static void main(String[] args){
    int arr[]={5,4,1,3,2,2,3,2,3,2,4,5,2,1,2,1,2};
    countingSort(arr);
    print(arr);

}
}
