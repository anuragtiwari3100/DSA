import java.util.Scanner;
public class ChangeArr {
    public static void changeArr(int arr[],int i,int val){
        //basee case
        if(i==arr.length){
         printArr(arr);
         return;
        }

        //recursion->kam
        arr[i]=val;
        changeArr(arr,i+1,val+1);
        arr[i]=arr[i]-2;

    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   int arr[]=new int[5];
   System.out.print("enter the index");
   int i=sc.nextInt();
   System.out.print("enter the val");
   int val=sc.nextInt();
      changeArr(arr,i,val);
       printArr(arr);
       sc.close();
    }
}
