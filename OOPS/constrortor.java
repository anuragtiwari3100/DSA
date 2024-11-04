/*
 public class constrortor {
    public static void main(String[] args){
        Student s1=new Student("Abhishek");// we create constructor by our side , then we will able to initialize means we can set name at initialy state
       System.out.println(s1.name);
    }   
}
 class  Student{
      String  name;
      int roll;
       Student(String name){ // if we do not create this constructor  java will create  construtor automatically during object creation
        this.name=name; 
        System.out.println();
       }
 }
 */
/*
 //parameterrized and default constructor
public class constrortor {
    public static void main(String[] args){
    Student  s1=new Student();
    Student s2=new Student("Abhishek");
    Student s3=new Student(123);
    // means appropriate constructor accordingly call ho jaega jaise ki yaha khali wala khali wale ke lie ,name wala name wale ke lie and roll wala roll wale ke lie  ,such type of phenomena is known as construcor overloading 
    // Student s4=new Student("abhi",4);// abhi aisa koi constructor banaya hi nahi obviously obviously  should generate error
        
    }
}
class Student{
    String name;
    int roll;
    Student(){
        System.out.println("Constructor is created......");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;

    }

}
 */
/*
 //copy constructor
public class constrortor {
    public static void main(String[] args){
    Student  s1=new Student();
    s1.name="abhishek";
    s1.roll=456;
    s1.password="xyz";
     Student s2=new Student(s1);
     s2.password="xyz";
        
    }
} 
class Student{
    String name;
    int roll;
    String password;
    //copy constructor it copied the property of s1 into s2
    Student(Student s1){//khud ka hi obj khud as parameter me aa rha hai
    this.name=s1.name;
    this.roll=s1.roll;
    }
    Student(){
        System.out.println("Constructor is created......");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;

    }

}
 */
/*
 
// as we know whenever if we copy an array,into another array its ref value gret copie ,so if we change in existing  one it will bring changes also in newly crited araray 
public class constrortor {
    public static void main(String[] args){
    Student  s1=new Student();
    s1.name="abhishek";
    s1.roll=456;
    s1.password="xyz";
     s1.marks[0]=100;
   s1.marks[1]=90;
   s1.marks[2]=80; 
     Student s2=new Student(s1);
     s2.password="abc";
     s1.marks[2]=100;
     for(int i=0;i<3;i++){
        System.out.println(s2.marks[i]);
     }
   
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    //copy constructor it copied the property of s1 into s2
    Student(Student s1){//khud ka hi obj khud as parameter me aa rha hai
     marks =new int[3];
        this.name=s1.name;
    this.roll=s1.roll;
    this.marks=s1.marks;
    }
    Student(){
            marks =new int[3];
        System.out.println("Constructor is created......");
    }
    Student(String name){
            marks =new int[3];
        this.name=name;
    }
    Student(int roll){
            marks =new int[3];
        this.roll=roll;

    }

}
 */

// shalloe  and deep copy
public class constrortor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "abhishek";
        s1.roll = 456;
        s1.password = "xyz";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        Student s2 = new Student(s1);
        s2.password = "abc";
        s1.marks[2] = 100; 
        for (int i = 0; i < 3; i++) {//we are not doing like this.marks=s1.marks but here we  just taaking one by one input will get marks uncjhngd
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    /*
     * //shallow copy constructor
     * Student(Student s1){
     * marks =new int[3];
     * this.name=s1.name;
     * this.roll=s1.roll;
     * this.marks=s1.marks;
     * }
     */
    // deep copy constructor
    
    Student(){
            marks =new int[3];
        System.out.println("Constructor is created......");
    }

    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll; 
        for(int i=0;i<marks.length; i++){
            this.marks[i]=s1.marks[i];
        }
        System.out.println("Constructor is created......");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;

    }

}