/*
 * 
 //this is parametrize constructot
// public class constructexample {
   
//     public static void main(String[] args) {
//         // Creating a new Student object with name "Anurag" and roll number 34
//         Student newStudent = new Student("Anurag", 34);
        
//         // Printing the name and roll number of the newStudent object
//         System.out.println(newStudent.Name);
//         System.out.println(newStudent.Roll);
//     }
// }

// class Student {
//     String Name;
//     int Roll;




//     //parameterize contretor
//     Student(String name, int roll) {
//         this.Name = name;
//         this.Roll = roll; 
//     }
// }
 */



/*
 
// ////default Constructor
// public class constructexample {
   
//     public static void main(String[] args) {
//         Student newStudent = new Student();
        
        
//     }
// }

// class Student {
//     String Name;
//     int Roll;




   
//     Student() {
//         System.out.println("Contstructor is Called.....");
   
//     }
// }



 */






/* 
 * 
 
 //note :1=> a class can contain  multiple constructor  at the same time based on the requirments
//The process where we can create as many objects as we want, and based on the object's creation, the most suitable constructor is automatically called, is known as constructor overloading."

public class constructexample {
   
    public static void main(String[] args) {

         //creating an a new object with the healp of a default constructor
         Student  s2 = new Student();
        // Creating a new Student object with name "Anurag" and roll number 34 with the healp of  para meterize constrctor
        Student s1 = new Student("Anurag", 34);   
        // Printing the name and roll number of the s1 object
        System.out.println(s1.Name);
        System.out.println(s1.Roll);

        Student s3 = new Student("abhiskek");
        System.out.println(s3.Name);

        Student s4  = new Student(34);
        System.out.println(s4.Roll);
        
    }
}

class Student {
    String Name;
    int Roll;

 //default constructor
    Student (){
        System.out.println("Constructor is called.......");
    }

    //parameterize contretor with two parametrs
    Student(String name, int roll) {
        this.Name = name;
        this.Roll = roll; 
    }

      //parameterize contretor with two parametrs
     Student(String name){
        this.Name =  name;
     }


     Student(int roll){
        this.Roll =  roll;
     }
 


}
 
*/



///xsx

////This is the copy  Constructor
public class constructexample {
   
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.Name =  "Abhi";
        S1.Roll = 456;
        S1.Password = "affmkwn";

     

        //
        Student s2  =  new Student(S1);
        s2.Password =  "abhi";
 
        
        
    }
}

class Student {
    String Name;
    String Password;
    int Roll;
   





   
    Student() {
        System.out.println("Contstructor is Called.....");
    
    }

//This is a copy constructor which copies the vlaiues of constrtrutor s1 inti s2
    Student(Student S1){
          
          this.Name = S1.Name;
          this.Roll  = S1.Roll;
                  System.out.println("Name is "+Name);

        System.out.println("Roll is "+Roll);

          
      
 
    }
}