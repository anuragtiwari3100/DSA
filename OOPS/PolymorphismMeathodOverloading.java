

//Function overloading =>ex of Complilw time Polumorphism b/c compliler ko ye pata the ki 2 int wale summ ke lie kon sa meathod run karna hai ,3 int wale no ke lie kon sa meathod run karna hai 
public class PolymorphismMeathodOverloading{
       public static void main(String args[]){
        Calculator calc = new Calculator();
        System.out.println("The Sum of Two Number  is:"+calc.sum(2,3));
        System.out.println("The Sum of the 2 Float No is:"+calc.sum((float)2.1,(float)3.2));
        System.out.println("The Sum of  Three int No is:"+calc.sum(3, 10,4));

       }
    
}

 class Calculator{
     
    int sum(int a, int b){
         return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

   int sum(int a,int b,int c){
    return a+b+c;
   }
     
 }  