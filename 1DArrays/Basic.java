import java.util.*;

public class Basic {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
          System.out.print("eneter your first subject marks:");
        marks[0] = sc.nextInt();
                  System.out.print("eneter your second subject marks:");
        marks[1] = sc.nextInt();
                  System.out.print("eneter your Third subject marks:");
        marks[2] = sc.nextInt();

        System.out.println("marks of phy:" + marks[0]);
        System.out.println("marks of Chem:" + marks[1]);
        System.out.println("marks of Bio:" + marks[2]);
          
/*        updating
        marks[2]=marks[2]+1;
                System.out.println("marks of Bio:" + marks[2]); */
sc.close();
float percentage=(marks[0]+marks[1]+marks[2])/3;
  System.out.println("Percentage is :"+percentage+"%");
   System.out.println("the length of array is   "+marks.length);
    }
}
 