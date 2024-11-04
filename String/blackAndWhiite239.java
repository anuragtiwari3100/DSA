
/*=
  Count the black as we go  ahead  and as we get 0 just increase swap by adding the value of black   ~~~ swap  = swap +black 
 */
public class blackAndWhiite239 {
    public static int CountBw(String  str){
        long n = str.length();
        long  swap =0;
        long blackCount =0;
        
        for(int i=0; i<n; i++){
            if(str.charAt(i) == '0'){  

                swap+=blackCount;
            }else{
                blackCount++;
            }
        }
        return  (int)swap;
    }
    public static void main(String args[]){

  
        System.out.println("RadheKrishna..");
        String str = "1101";
        long result =CountBw(str);
        System.out.println(result);
    }
}