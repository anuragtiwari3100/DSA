 public class invertedHalfPyramidWihNo {



    public static void inverted_HalfPyramidWih_No(int n){
        //Outer Loop
        for(int i=1; i<=n; i++){// it  always tracks how  many line we habe to print
            //inner loop
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();


        }
    }

    public  static void main(String args[]) {
        inverted_HalfPyramidWih_No(15);
    
        
    }
 
    
 }