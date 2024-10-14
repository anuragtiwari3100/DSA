 import java.util.Scanner;
    public class FindlArgest{
        public static  void Findlargest(int marks[][]){
            int largest =0; // Initialize the largest value to the first element
             Scanner sc = new Scanner(System.in);
                 int m = sc.nextInt();
                int n = sc.nextInt();
      sc.close();
            // Find the largest element in the matrix
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (marks[i][j] > largest) {
                        largest = marks[i][j];
                    }
                }
            }
    
            System.out.println("The largest mark is: " + largest);
        }
         
        //   for(int i=0;i<marks.length;i++){
        //     for(int j=0;j<marks[0].length;j++){
        //          if(largest>marks[i][j]){
        //              largest=marks[i][j];
        //          }
        //          System.out.println("Max max achived is:"+largest);  
        //     }
        //   }         
       
        // }
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

            Findlargest(marks);
        
            sc.close();
        }
    }
    
    
