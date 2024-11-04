public class Student {
    private String name;
    private int age;
    private String studentID;

    // Constructor
    public Student(String name, int age, String studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentID() {
        return studentID;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}

public class Student {
    public static void main(String[] args) {
        // Create a new Student object
        Student student1 = new Student("John", 20, "S12345");

        // Accessing attributes directly (not recommended)
        System.out.println("Student Name: " + student1.name); // Error: 'name' has private access in Student class

        // Accessing attributes using getter methods
        System.out.println("Student Name: " + student1.getName()); // Output: John

        // Modifying attributes using setter methods
        student1.setAge(21);
        System.out.println("Student Age: " + student1.getAge()); // Output: 21
    }
}
