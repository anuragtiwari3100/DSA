
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
