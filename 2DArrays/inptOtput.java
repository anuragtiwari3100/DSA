import java.util.Scanner;
public class inptOtput{

  public static  boolean   searchElement(int arr[][],int key){
    for(int i=0; i<arr.length; i++){
     for(int j=0; j<arr[0].length; j++){
           if(arr[i][j] == key){
             System.out.println("element  Found  at cell ("+ i+ ","+j+")");
             return true;
           }
     }
    }
    return  false;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the size of your Array in m*n");
        int  m = sc.nextInt();
        System.out.print("*");
        int n= sc.nextInt();
         int arr[][] = new int [m][n];
        System.out.println("Enter the elements of Your  arrays");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                 arr[i][j] = sc.nextInt();
            }
        }



        //printing the Elemnts of array
        System.out.println("Elements of array are");
      for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
      searchElement(arr,5);
      sc.close();

    }
}