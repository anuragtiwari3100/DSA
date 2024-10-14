public class methodOverrid {
    public static void main(String[]args){
      Animal anm=new Animal();
      anm.eat();  

    }
    
}
class Animal{
    void eat(){
        System.out.println("eat everything");
    }

}
class Dear extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}