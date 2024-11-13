public class StringMatch {
    public static void search(String pat, String txt) {
        int M = pat.length(); // Length of the pattern
        int N = txt.length(); // Length of the text
        boolean found = false;
        // Loop to slide pat[] one by one over txt[]
        for (int i = 0; i <= N - M; i++) {
            int j;
            // For current index i, check for pattern match
            for (j = 0; j < M; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {           
                    break;
                }
            }
            // If pattern is found
            if (j == M) {
                System.out.println("j is "+j);
                System.out.println("Pattern found at index " + i);
               found = true;
            }
        }
        if(!found){
            System.out.println("Pattern did not found");
         }       

    }
    public static void main(String[] args) {
        String txt = "ACAAABAC";
        String pat = "xyz";
        search(pat, txt);
       
    }
}