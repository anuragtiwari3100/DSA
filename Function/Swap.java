
public class Swap {
    public static  void interchange(int x,int y){
          int temp=x;
          x=y;
          y=temp;
          //yaha valuue swaped hai  but this is for just this function not  for our main    function
          System.out.println("values of a after swap"+x);
          System.out.println("Value y after swapping y:"+ y);
        
    }
    public static void main(String args[]){
           int a=10;
           int b=19;
       
           interchange(a,b); 
           /*
             printing inside the main function won;t swap b/c  changes  took places inside  the  interchange functin not in the main function due to call by  value where we do't pass actual values we just passed  copy of our actual  value
              System.out.println("values of a after swap"+a);
            System.out.println("Value y after swapping y:"+b );
            */
          
    }
    
}
