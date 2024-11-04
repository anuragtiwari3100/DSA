public class methodOverloding {
    
     public static void main(String[] args){
        Calculator cal=new Calculator();
        System.out.println(cal.sum(2,4));
        // System.out.println(cal.sum(1.3,1.4));//by default whenever  we use decimal in number java consider it as double so we need to typecasst in whicever dt we want
               System.out.println(cal.sum((float)1.3,(float)1.4));

        System.out.println(cal.sum(2,3,4));

     }
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    
    float sum(float a,float b){
        return a+b;
    }
    float sum(int a,int b,int c){
        return a+b+c;
    }
}
