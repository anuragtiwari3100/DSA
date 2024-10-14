import java.util.Stack;
public class MaxAreaHistogram {
    public static void maxArea(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //Next Smaller Right
        Stack<Integer> s = new Stack<>();
    
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                //n
                nsr[i] = arr.length;
            }else{
                //top
                nsr[i] = s.peek();
            }
            s.push(i);
        }

       //Next Smaller left
      s = new Stack<>();
    
       for(int i=0; i<arr.length; i++){
           while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
               s.pop();
           }
           if(s.isEmpty()){
               //n
               nsl[i] = -1;
           }else{
               //top
               nsl[i] = s.peek();
           }
           s.push(i);
       }

       //Cuurent area: width = j-i-1 = nsr[i]-nsl[i]-1
        for(int i=0; i<arr.length; i++){
            int height =arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width ;
            maxArea = Math.max(currArea,maxArea);
        }
        System.out.println("jai shree ram");
        System.out.println("Max area in histogram ="+ maxArea);
      

    }
    public  static void main(String[] args){
        int arr[] = {2,1,5,6,2,3}; //heights of histogram
        maxArea(arr);   
    }
    
}
