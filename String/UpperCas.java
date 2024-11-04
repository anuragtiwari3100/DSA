import java.util.Scanner;
public class UpperCas {
    public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder("");
         char ch=Character.toUpperCase(str.charAt(0));
         sb.append(ch);

         for(int i=1;i<str.length(); i++){
            if(str.charAt(i)==' '&& i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
         }
         return sb.toString();
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
      System.out.println(" Enter you String");
      String str=sc.nextLine();
      System.out.println(toUpperCase(str));
      sc.close();
    }
    
}
//Time complexity O(n);->linear time complexity
//time is 5:29 time to snake todays is 13th of november