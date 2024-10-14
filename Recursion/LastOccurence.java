    
    import java.util.Scanner;

    public class  LastOccurence {
        // public static int firstoccurence(int arr[],int key,int i){
        //      if(i==arr.length){
        //         return -1;
        //      }
        //      if(arr[i]==key){
        //         return i;
        //      }
        //       return  firstoccurence(arr,key,i+1);
        // }

        public static int lastOccurence(int arr[],int key,int i){
              if(i==arr.length){
                return -1;
             }
            int isFound=lastOccurence(arr,key,i+1);
            if(isFound==-1&& arr[i]==key){
                return i;
            }
           return isFound;
        }
    
        public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
          int arr[]=new int[10];
                System.out.print("Enter the value of array:");
                for(int i=0;i<arr.length;i++){
                   arr[i]=sc.nextInt();
                }
                System.out.println("enter the key that you want to search:");
                int key=sc.nextInt();
                System.out.println("enetre idex");
                 int i=sc.nextInt();
              System.out.println("occuerence of element is at index:"+lastOccurence(arr,key,i+1));
              sc.close();
    }
    }
    
