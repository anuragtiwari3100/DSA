
package hashSet;
import java.util.*;
public class HASset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(2);
System.out.println(set);


/*
System.out.println("Enter the value of n");
int n = sc.nextInt();

if(set.contains(n)){
    System.out.println("Yes ! Set Contains  "+n);
}else{
    System.out.println("No !Set does not Contains this Value"+n);
}
*/

/*
 
System.out.println("enter the value want to remove");
int n2= sc.nextInt();
if(set.contains(n2)){
    System.out.println("Yes ! value  was remove  "+n2);
}else{
    System.out.println("No !Set does not Contains this Value"+n2);
}
set.remove(n2);
 */
System.out.println(set.isEmpty());
System.out.println(set.size());
 set.clear();
 System.out.println(set.size());
 System.out.println(set.isEmpty());
 
    }
}
