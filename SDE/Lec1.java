public class Lec1{



    public static int Q1seriesSum(int n) {
        if(n==1){
            return 1;
        }
          return n+Q1seriesSum(n-1);
        
    }
      public static int Q2reverseDigits(int n){
         int finalVal = 0;
       while(n != 0){
           int lastDif = n %10;
           finalVal= (finalVal*10)+lastDif;
           
           n= n/10;
       
       }
             return finalVal;
    }

        static boolean Q3armstrongNumber(int n) {
        int finalres =0;
        int orignal =n;
        while(n !=0){
            int lastDig = n%10;
            int qube = lastDig *lastDig*lastDig;
            finalres += qube;
              n /= 10;
        }
        return  finalres==orignal ;
      
    }



public boolean isPalindrome(int n) {
      int finalDig =0;
      int orignal = n;
       while( n !=0){
           int lastIndex = n%10;
           finalDig = (finalDig*10)+lastIndex;
           n /= 10;
           
       }
       return  finalDig == orignal;
        
    }


        public boolean isPalindrome(String s) {
     int left = 0;
     int right = s.length() -1;
     while(left < right){
         char l =s.charAt(left);
         char r = s.charAt(right);
         if(!Character.isLetterOrDigit(l)){
            left++;

         }
         else if(!Character.isLetterOrDigit(r)){
            right--;
         }
         else if(Character.toLowerCase(l) !=Character.toLowerCase(r)){
           return false;
         }
         else{
            left++ ; right--;
         }
     }
     return true;
    }

    
    public static void main(String[] args) {

          System.out.print("hi");
        
    }
}