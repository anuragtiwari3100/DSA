
public class Passing {
    public static void updatemarks(int marks[],int noonChangeble){
        noonChangeble=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
   
    public static void main(String[] args){
          int marks[]={98,99,100};
          int noonChangeble=5;
       updatemarks(marks,noonChangeble);
          System.out.println(noonChangeble);
       for(int i=0;i<marks.length;i++){
        System.out.print(marks[i]+" ");
       } 
       System.out.println();
    }
      
    
}


 
/*

 

In Java, reference data types (e.g., arrays, objects) 
are passed by reference, meaning the function gets access to the actual
 object. Changes made to the object inside the function affect the original object,
  as both share the same reference.


  In Java, primitive data types (e.g., int, float, char) 
  are passed by value, meaning a copy of the value is sent 
  to a function. Changes inside the function do not affect the 
  original variable.


 */