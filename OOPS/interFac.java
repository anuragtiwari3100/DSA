/*
 public class interFac {
     public  static void main(String[]args){
        Queen q=new Queen();
        q.moves();
     }
    
}
//we have  specifed the blueprint of moves  we have not defined yet beacuse every chase player will be ahving its own  moves so classes will implemented itself acoordongly

interface chasePlayer{
 void moves();
    
}
class Queen implements chasePlayer{
    public void moves(){
        System.out.println("up,down,right,diagonal(in all 4 direction)");
    }
}
 class Rook implements chasePlayer{
    public void moves(){
        System.out.println("up,down,right");
    }
 }
 class king implements chasePlayer{
    public void moves(){
        System.out.println("up,down,right,diagonal(1 step)");
    }
 }
 */

/*
 public class interFac {
    public static void main(String[]args){
        Student s1=new Student();
        s1.schoolname="dav";
        Student s2=new Student();
        System.out.println(s2.schoolname);
        Student s3=new Student();
        s3.schoolname="xyz";// s1/s2/s3 schollname=xyz;

    }
}
class Student{
    String name;
    int roll;
    static String schoolname;
    void setName(String name){

        this.name=name;
    }
    String getName(){
        return this.name;
    }
}
 */
 public class interFac {
    public static void main(String[]args){
        Horse h=new Horse();
    }
}
class Animal{
    Animal(){
        System.out.println("animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        super();  
        System.out.println("Horse construtor is called");
    }
}