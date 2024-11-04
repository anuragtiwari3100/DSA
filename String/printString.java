    import java.util.Scanner;   
    public class printString{
       public static void print(String str){
           for(int i=0; i<str.length();i++){
     System.out.print(str.charAt(i)+" ");            
           } 
           System.out.println();       
       }
        public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter First Name:");
    String firstName=sc.nextLine();
        System.out.print("enter  Last Name:");
    String lastName=sc.nextLine();
    String fullName=firstName +lastName;
    print(fullName);
    sc.close(); 
    
        }
    }

