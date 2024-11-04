
//althow it does not  exixt in java 
public class CallByvalRef{
    public static void changeValue(int a){
        a*=100;
        System.out.println("Inside change value"+a);
    }
    public static void main(String[]args){
        int a=10;
        System.out.println("before changing value:"+a);
        changeValue(a);
        System.out.println("After changing value:"+a);


    }
}
// jab hamne function call kia to  changeValue() function me a pass by value hua changeValue() iske ader ke a ke lie naya addrsee bana menory me aur var ka value 1000 kia gya 