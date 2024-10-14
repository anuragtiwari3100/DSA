public class mcqseries {
    public static void decreses(int n1,int n2){
      n1--;
      n2=n2-2;
      System.out.println(n1+":"+n2);
      //n1 and n22 are formel paramenters or parameters
    }
    public static void makeTwice(int p){
        p=p*2;
                System.out.println(p);

    }
     public static void temp(int p){
        int q=p;
        q=q-100;
     }    
    public static void main(String[]args){
        /*
         int p=26;
        int q=13;
        decreses(p,q);
        System.out.println(p+":"+q);
         //p and q are actual parameters 
         */

     /*  
      int p=24;
        makeTwice(p);
        System.out.println(p); */
       
        /*
          int p=890;
        temp(p);
        System.out.println(q);->it will throw an error becuse the  scope of temp and main are different and here we eant to acces an var which is not our scope so definatly error
         */
       
    }    
}
/* 
koi effect nhi padega p and q ke value pe n1 and n2  do alag var banege jinki value n1=p,n2=q hongi but value to n1 aur n2  ki hi change hongi na ki p aur q ki
*/