import java.util.Scanner;
public class SerchKey {
    public static boolean Search(int marks[][]){
           Scanner sc = new Scanner(System.in);
            System.out.println("enter the key that you want to search");
        int key=sc.nextInt();
         sc.close();
      for(int i=0;i<marks.length;i++){
        for(int j=0;j<marks[0].length;j++){
             if(marks[i][j]==key){
                  System.out.println("key found at index"+"("+i+","+j+")");
                  return true;
             }
            
        }
      }
    
     System.out.println("key not found");
      return false; 
     
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix that you want");  
        int m = sc.nextInt();
            int n = sc.nextInt();
        int marks[][] = new int[m][n];
        System.out.println("Enter marks of each student having " + n + " subjects");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("Marks:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row of marks
        }
        Search(marks);
        sc.close();
    }
}

