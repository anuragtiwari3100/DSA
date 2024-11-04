import java.util.*;
public class Displacement {
    public static float getShorttestPath(String path){
         int x=0,y=0;
         for(int i=0; i<path.length(); i++){
            char dir= path.charAt(i);
            //south
            if(dir=='S'){
                y--;

            }
            //nort
            else if(dir=='N'){
                y++;
            }
            //west
            else if(dir=='W'){
                x--;
            }
            //east
            else{
                x++;
            } 

         }
         int X2=x*x;
         int Y2=y*y;

         return (float)Math.sqrt(X2+Y2);
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your path that you want to travel:");
        String path=sc.next();
        // String path="WNEENESENNN";
        System.out.println("Shortest path is:"+getShorttestPath(path));
        sc.close();
    }
    
}
