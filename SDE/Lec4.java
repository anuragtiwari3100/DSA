package SDE;



public class Lec4 {
       public static void  printNo(int n){
     if(n<1){
        return;
     }
     System.out.print(n+" ");
     printNo(n-1);
     
   }

     public static void  printNo2(int n){
     if(n == 0){
        return;
     }
  
    printNo2(n - 1); // call first
    System.out.print(n + " "); // print after
     
   }
 

   public  static void  fibSeries(){

   }

      //https://leetcode.com/problems/split-array-into-fibonacci-sequence/description/

   public static   void sqrt(){
      
         
   }

   public static int Factrial(int n){
      if( n== 0){
         return  1;
      }
      return  n*Factrial(n-1);

   }


   public static int Fiboo(int n){
        if(n == 0 || n==1){
           return n;
        }
        return  n+Fiboo(n-1);
   }


    public static void main(String args[]){
    printNo2(10);
   //  printNo(10);
   // int res =Factrial(5);
   //  System.out.println(res);
   //  System.out.print(Fiboo(5));

    }
}
