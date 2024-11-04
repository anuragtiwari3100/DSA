class Abstraction {
    public static void main(String args[]) {
        Mustang myHorse = new Mustang();
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor is called");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse Constructor is called");
    } 

    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang class is called");
    }
}
