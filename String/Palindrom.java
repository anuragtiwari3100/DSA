import java.util.Scanner;
public class Palindrom {
    public static boolean checkPalindrome(String name){
         int n=name.length();
      for(int i=0;i<name.length()/2;i++){
      if(name.charAt(i)!=name.charAt(n-i-1)){
                   System.out.println("Enter string is not palindrome") ; 

           //not a palindrome 
           return false;
      }
      }
             System.out.println("Enter string is  palindrome");

       return true;
    }

    
public static  void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your String:");
      String str=sc.next(); 
    System.out.print(checkPalindrome(str));
    sc.close();
}
    
}
