 
    import java.util.Scanner;
    public class Concate{
        public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter First Name:");

    String firstName=sc.nextLine();
        System.out.print("enter  Last Name:");
 
    String lastName=sc.nextLine();
    String fullName=firstName+" "+lastName;
    System.out.println(" Full name is:  "+fullName);
      // to find letter
     System.out.println("location of"+"enterned index is:"+fullName.charAt(3));
    sc.close(); 
    
        }
    }
