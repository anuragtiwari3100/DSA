import java.util.Scanner;
public class Permutation {
    public static void findPermutation(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return ;
        }
        //recursion =>O(n)
        for(int i=0;i<str.length();i++){
            
            char curr=str.charAt(i);
            //"abcd"=>"ab"+"de"=abde to remove c
         String   Newstr=str.substring(0,i)+str.substring(i+1);
            findPermutation(Newstr,ans+curr);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String str=sc.next();

        findPermutation(str,"");
        sc.close();

    }
    
}
