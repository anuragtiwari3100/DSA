import java.util.Stack;
public class Rev_String {
    public static String reverseString(String str){
        Stack <Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
    }
    StringBuilder result =new StringBuilder("");
    while (!s.isEmpty()) {
    char curr = s.pop();  
    result.append(curr);      
    }
   return result.toString();//string builder aur string ka type alag hota hai to  jab stringBuilder ko string me store karate hai to tostring wala function use karte hai(20,1,26 setting in fromnt of two black people and revison at gpj library)
}
    public static void main(String[] args){
  
         String str= "abc";
         String result = reverseString(str);
         System.out.print(""+result);
    }
}
