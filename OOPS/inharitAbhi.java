import javax.sound.sampled.SourceDataLine;

class  inharitAbhi{
    public static void main(String args[]){
 

        Fish myfish = new Fish();
        myfish.eat();
        myfish.breath();


        Dog sittu = new Dog();
        sittu.eat();
        sittu.legs  = 4;
        System.out.println(sittu.legs);



        bird mybird = new bird();
        mybird.eat();
        mybird.breath();
    }
}

//Base Class

class Animal{
    String Color;

    void eat(){
        System.out.println("Animal is eating");
    }

    void breath(){
        System.out.println("Animal is breathing");
    }
}


class Mamals extends Animal{
     int legs;

     

}


class Mamals1 extends Animal{
    void walk(){
        System.out.println("walks");
    }

    

}

class Fish1 extends Animal {


    void swim(){
       System.out.println("Fish1 swims");
    }
}

class bird extends Animal{
  void fly(){
    System.out.println("Fish1 swims");

  }

}

class Dog  extends Mamals{
    String Bride;
}


//derived class
class Fish extends Animal {
     int fins;

     void swim(){
        System.out.println("Fish swims");
     }
}