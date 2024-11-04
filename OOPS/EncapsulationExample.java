public class EncapsulationExample {
    public static class Person {
        // Private attributes
        private String name;
        private int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter method for name
        public String getName() {
            return name;
        }

        // Setter method for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter method for age
        public int getAge() {
            return age;
        }

        // Setter method for age
        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("Age should be a positive number.");
            }
        }

        // Method to display person's information
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public static void main(String[] args) {
        // Creating a new Person object
        Person person1 = new Person("John", 30);

        // Accessing and modifying attributes using getter and setter methods
        System.out.println("Initial Information:");
        person1.displayInfo(); // Displaying initial information

        // Modifying name and age using setter methods
        person1.setName("Jane");
        person1.setAge(25);

        // Displaying updated information
        System.out.println("\nUpdated Information:");
        person1.displayInfo();
    }
}
