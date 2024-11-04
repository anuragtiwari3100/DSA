import java.util.Scanner;
public class Basic{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your name");
String name=sc.next();// only a single word
System.out.println("Name is "+name);
String name1=sc.nextLine();  // complete line
System.out.println("Name is "+name1);
System.out.println("Lenth of name1 is:"+name1.length());
sc.close();



    }
}