public class AcessSpeciFir {
     public static void main(String[] args){
        BankAccount myAcc= new BankAccount();
       myAcc.username="Abhishek";
       myAcc.setPassword("@abhi"); 
     }
    
}
 class BankAccount{
    public  String username;
    private String password;
      public void  setPassword(String pwd){
        password=pwd;
      }
 }