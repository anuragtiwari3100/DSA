import java.util.Stack;
public class FindDouplicateConstra {
      public  static boolean isDuplicate(String str){
     Stack<Character> s = new Stack<>();  
      for(int i=0; i<str.length(); i++){
        char ch =  str.charAt(i);

        //openning,operator , operands
         //closing
         /*
           if(ch == ')'){
            int count = 0;
            while(s.peek() !='('){
                s.pop();
                count++;  
            }
             if(count < 1){
                return true; //duplicate
             }else {
                s.pop();//opening pair
             }
         }else{
            //opening

            s.push(ch);
         }

         -------------------------------------------- any block can be use
          if(ch == ')'){
            int count = 0;
            while(s.pop() !='('){
          
                count++;  
            }
             if(count < 1){
                return true; //duplicate
             }
         }else{
          */ 
         if(ch == ')'){
            int count = 0;
            while(s.pop() !='('){
          
                count++;  
            }
             if(count < 1){
                return true; //duplicate
             }
         }else{
            //opening
            s.push(ch);
         }

      } 
      return false;
    }
    public static void main(String[] args){
        String str = "((a+b))";// true
        String str2 = "(a-b)"; //false
        System.out.println(isDuplicate(str2));
        System.out.println(isDuplicate(str));
    }
    
}
