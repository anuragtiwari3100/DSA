public class PolymorphismMeathodOverriding {
    


//Function overloading =>ex of Complilw time Polumorphism b/c compliler ko ye pata the ki 2 int wale summ ke lie kon sa meathod run karna hai ,3 int wale no ke lie kon sa meathod run karna hai 
public static void main(String args[]){


    Dear myDear = new Dear();
    myDear.eat();
    

   }

}


class Animal{
    void eat(){
        System.out.println("Eats anythings");
    }
}


class Dear  extends Animal {
    void eat(){
        System.out.println("Eats grass");
    }
}











