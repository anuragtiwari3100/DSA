public class gettersetter {
     public static void main(String[] args){
        Pen p1=new Pen(); // created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
          p1.setColor("yellow");
         System.out.println(p1.getColor());
        
       }
     }
    

class Pen{
   private  String color;
   private int tip;// tip pen ke andar ka vriable hai
    String getColor(){
       return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
       this.color=newColor;

    }
    void setTip(int newTip){// koi naya tip pass kia hai
        this.tip=newTip;
    }
}


