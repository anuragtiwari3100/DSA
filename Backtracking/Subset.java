public class Subset {
    public static void findSubset(String str,String ans,int i){
        // base case
        if(i==str.length()){
         if(ans.length()==0){
            System.out.println("null");
        }else{
            System.out.println(ans);
        }
         return;
        }
        //recursiom->kam
        //choice2->1.yes,2.No
        //yes
        findSubset(str,ans+str.charAt(i),i+1);
        //no
        findSubset(str,ans,i+1);
    }
    public static void main(String[] args){
        String str="abc";
        System.out.println(str.length( ));
        findSubset(str,"",0);
        
    }
    
}
