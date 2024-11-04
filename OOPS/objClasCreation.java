public class objClasCreation{
    public static void main(String[]arggs){
        Pen p1=new Pen(); // created a pen object called p1
     p1.setColor("Blue");
     System.out.println(p1.color);
     p1.setTip(5);
     System.out.println("Tip of the pen is:"+p1.tip);
       p1.color="yellow";
       System.out.println(p1.color);
       p1.setTip(5);
     System.out.println("Tip of the pen is:"+p1.tip);
    }
  


} 
//look we have created classes below the public class it resolve our error ,but if we create these classes  above the public class it may be that  during vreation of object we have to face error
//Creating  others classes above  the main public class can prevent errors that might occur when creating objects if the classes were defined above the main class. This is due to the sequential nature of code execution. 
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;

    }
    void setTip(int newTip){
        tip=newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;//cgpa
     void calcPercentage(int phy,int chem,int math){
        percentage=(phy+chem+math)/3;
     }

}
