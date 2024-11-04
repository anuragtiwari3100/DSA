import java.util.*;


public class PrinBinaryString {
    public static void printBinStrings(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        /*
         * //kam
         * if(lastPlace==0){
         * // sit 0 on chair n
         * printBinStrings(n-1,lastPlace,str.append("0"));
         * printBinStrings(n-1,1,str.append("1"));
         * 
         * }else{
         * printBinStrings(n-1,lastPlace,str.append("0"));
         * }
         * }
         */
        // or
        printBinStrings(n - 1, lastPlace, str + "0");
        if (lastPlace == 0) {
            printBinStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        // StringBuilder str=new StringBuilder("");
        // System.out.println("enter binary string please");
        // int n=sc.nextInt();
        // System.out.println("enter the binary string value last index(should 0 or
        // 1)");
        // int lastPlace=sc.nextInt();
        // System.out.println("Enter the String Builder");
        // String str=sc.nextString();
        printBinStrings(3, 0, "");

    }

}
