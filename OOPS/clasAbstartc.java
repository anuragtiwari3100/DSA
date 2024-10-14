/*
 public class clasAbstartc {
    public static void main(String[] args){
        Horse hr = new Horse();
        hr.eat();
        hr.walk();
        System.out.println("hello");

        Chicken chick = new Chicken();
        chick.eat();
        chick.walk();
    }
}

abstract class Animal {
    void eat() {
        System.out.println("animal eats");
    }
    
    abstract void walk(); // Abstract method
}

class Horse extends Animal {
   
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
 
    void walk() {
        System.out.println("walks on 2 legs");
    }
}

*/
/* 

// we can not create obj of abstract class but we can create  contructor of  abstract class

public class clasAbstartc {
    public static void main(String[] args){
        Horse hr = new Horse();
        hr.eat();
        hr.walk();
     System.out.println(hr.color);
    }
}

abstract class Animal {
    String color;

     Animal(){
        color="brown";
    }
    void eat() {
        System.out.println("animal eats");
        
    }
    
    abstract void walk(); // Abstract method
}

class Horse extends Animal {
    void changeColor(){ 
       color="dark brown";
    }
   
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    void changeColor(){ 
       color="yellow";
    }
 
    void walk() {
        System.out.println("walks on 2 legs");
    }
}

*/ 
public class clasAbstartc {
    public static void main(String[] args){
     mustang myhorse=new mustang();
     //Animal=>horse=>mustang
    }
}

abstract class Animal {
    String color;

     Animal(){
        System.out.println("animal constructor called");
    }
    void eat() {
        System.out.println("animal eats");
        
    }
    
    abstract void walk(); // Abstract method
}

class Horse extends Animal {
    Horse(){
        System.out.println("horse constructor called");
    }
    void changeColor(){ 
       color="dark brown";
    }
   
    void walk() {
        System.out.println("walks on 4 legs");
    }
}
class mustang extends Horse{
      mustang(){
        System.out.println("mustang constructor called");
      }
}
class Chicken extends Animal {
    void changeColor(){ 
       color="yellow";
    }
 
    void walk() {
        System.out.println("walks on 2 legs");
    }
}
