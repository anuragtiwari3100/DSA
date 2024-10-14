
import java.util.Scanner;
 
public class  QueenCountProblem {
    public static  boolean isSafe(char board[][],int row,int col){
        //vitically up
for(int i=row-1;i>=0;i--){
    if(board[i][col]=='Q'){
        return false;
    }
}
        // doagonaly up
          for(int i=row-1,j=col-1; i>=0 && j>=0 ;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
          }

        //diagonally  down 
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
   
    public static void nQueens(char board[][],int row){
         //base
     if(row==board.length){
        printBoard(board); 
        count++;
        return; 
     }
    // col loop
        for(int j=0;j<board.length;j++){
          if(isSafe(board,row,j)){
              board[row][j]='Q';
            nQueens(board,row+1);//function call
            board[row][j]='X';//backtracking step
          }
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("----------------------- chase board------------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
           System.out.println();           
        }
    }
       static int count =0;
    public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
         System.out.print("enter the value of you chaseboard: ");
         int n=sc.nextInt();
         System.out.print("enter the initial row: ");
         int row=sc.nextInt();
        char board[][]=new char[n][n];
        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
         // 0-> initial row->nQueens(board,0);
        nQueens(board,row);
        System.out.print("total ways to solve n queens:"+count);
        sc.close();
    }
    
}
