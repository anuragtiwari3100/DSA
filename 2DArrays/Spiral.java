public class Spiral {
    public static void printSpiral(int mat[][]){
        int  StartRow=0;
        int  StartCol=0;
        int   EndRow=mat.length-1;
        int Endcol=mat[0].length-1;
        while(StartRow<=EndRow && StartCol<= Endcol){
            //top
            for(int j=StartCol; j<=Endcol;j++){
               System.out.print(mat[StartRow][j]+" ");
            }
           //right
           for(int i=StartRow+1;i<=EndRow;i++){
               System.out.print(mat[i][Endcol]+" ");
           }
           //bottom
           for(int j=Endcol-1;j>=StartCol;j--){
                System.out.print(mat[EndRow][j]+" ");
                if(StartRow==EndRow){
                    break;
             }
           } 
           //left
          for(int i=EndRow-1;i>StartRow;i--){
             if(StartCol==Endcol){
                    break;
             }
              System.out.print(mat[i][StartCol]+" ");
          } 
          StartCol++;
          StartRow++;
           Endcol--;
           EndRow--; 
          
        }
        System.out.println();
    }

    public static void  main(String[] args){
     int mat[][]={{1,2,3,4},
                  {5,6,7,8},
                  {9,10,11,12},
                  {13,14,15,16}
                };
                printSpiral(mat);
    }
    
}
