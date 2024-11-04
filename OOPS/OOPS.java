public class OOPS {
  public static void main(String[] args) {

Pen p1 = new Pen();

p1.setColor("Blue");
System.out.println(p1.getColor());
p1.setTip(5);
System.out.println(p1.getTip());



Book mybook = new Book();
mybook.setTitle("The harder you try the luckier you get");
System.out.println("The updated title  of this book is:"+mybook.getTitle());

mybook.setPrice(345);
System.out.println("The new Price of this book is:"+mybook.getPrice());


  }
}


class Pen {
  private String Color;
  private int  tip;


  void setColor(String newColor){
    this.Color =  newColor;
  }

  String getColor(){
    return this.Color;
  }



  void setTip(int newTip){
    this.tip = newTip;
  }


  int getTip(){
    return this.tip;
  }


}


class Book{
    private String title;
    private  int price;


     void setTitle(String  newTitle){
            this.title = newTitle;
     }
      
     String getTitle(){
        return this.title;
     }


     void setPrice(int newPrice){
        this.price =  newPrice;
     }

    int  getPrice(){
         return this.price;
     }
}


