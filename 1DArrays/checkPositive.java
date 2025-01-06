public class checkPositive {
    public static  boolean  hasPostive(int arr[]){
          boolean  Positive = false;
          for(int i=0; i<arr.length; i++){
             if(arr[i]>0){
                Positive = true;  
                break;
             }
            System.out.println("After  this break line executed noting else will be printed");
          }
          if(Positive){
            System.out.println("There exist a  positive value");
         }else{
            System.out.println("doest not exist   positive value");
         }
          return  Positive;
    }
    public static void   main(String args[]){
        int arr[] =new int[]{1,-2,-5,7,-8,-9 ,-5};
     boolean  res =  hasPostive(arr);
     System.out.println(res);

    }
    
}
