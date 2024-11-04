import java.util.Scanner;
public class Substrin{
    public static String findsubstring(String str,int si,int ei){
    String substr="";
    for(int i=si; i<ei; i++){
        substr +=str.charAt(i);
        // substr=substr+str.charAt(i);
    }
      return substr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter yoour string");
        String str=sc.nextLine();
        System.out.println(findsubstring(str,0,8));
        // System.out.println(str.susbstring(0,5));  ->using inbuilt function
        sc.close();

    }
    
}
