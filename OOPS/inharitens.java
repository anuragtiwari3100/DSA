/*
//single level inharitense or only inharitense
 public class inharitens {
    public static void main(String[]args){
        Fish shark=new Fish();
        shark.eat();// because shark is the obj of fish here and fish has not function like eat but because it inherit from animal class thus it can acessble
    }
     
}

//Base /parent
class Animal{
    String color; 
    void eat(){
        System.out.println("Eating is one of the gretest bless for species given  by god to us");
    }
    void breath(){
        System.out.println("breathes");
    }
}
//derived class
class Fish extends Animal{
    int fins;
    void  swim(){
        System.out.println("swimes in water");
    }
}

 */

/*
 

//multilevel
public class inharitens {
    public static void main(String[]args){
       Dog puppy= new Dog();
       puppy.eat();
       puppy.legs=4;
       System.out.println(puppy.legs);
    }
     
}

//Base /parent
class Animal{
    String color; 
    void eat(){
        System.out.println("Eating is one of the gretest bless for species given  by god to us");
    }
    void breath(){
        System.out.println("breathes");
    }
}
 class Mamals extends Animal{
      int legs;
 }
 class Dog extends Mamals{
    String breed;
 }
//derived class
class Fish extends Animal{
    int fins;
    void  swim(){
        System.out.println("swimes in water");
    }
}
 */
/*
//Hierarchial inharitense
public class inharitens {
    public static void main(String[] args) {
        Mamals mam = new Mamals();
        Fish fs = new Fish();
        Bird br = new Bird();
        br.breath();

    }
}
// Base /parent
class Animal {
    String color;
    void eat() {
        System.out.println("Eating is one of the gretest bless for species given  by god to us");
    }
    void breath() {
        System.out.println("breathes");
    }
}
class Mamals extends Animal {
    void walk() {
        System.out.println("walks");
    }
}
class Fish extends Animal {
    void Swim() {
        System.out.println("awim");
    }
}

class Bird extends Animal {
    void Fly() {
        System.out.println("Flyis");

    }
}
 */


// Hybrid inharitense
public class inharitens {
    public static void main(String[] args) {
        Mamals mam = new Mamals();
        Fish fs = new Fish();
        Bird br = new Bird();
        br.breath();

    }

}

// Base /parent
class Animal {
    String color;

    void eat() {
        System.out.println("Eating is one of the gretest bless for species given  by god to us");
    }

    void breath() {
        System.out.println("breathes");
    }
}

class Mamals extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void Swim() {
        System.out.println("awim");
    }
}

class Bird extends Animal {
    void Fly() {
        System.out.println("Flyis");

    }
}
//3:45
