public class aa {

public static class  Node {

 Node children[];
 boolean eow; 
    public Node(){
        children = new Node[26];
        eow = false;        
    }
}


public static Node root = new Node();


public static void insert(String word){
    Node curr = root;
     for(int lev=0; lev<word.length(); lev++){
        int idx = word.charAt(lev)-'a';
        if(curr.children[idx] == null){
             curr.children[idx] = new Node();
        }
        if( curr.children[idx] == word.length()-1){
            
        }
     }
}


    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};

        
    }
    
}
