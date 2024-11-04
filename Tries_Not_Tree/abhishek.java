public  class abhishek{
    public  static class Node{
        Node Children[];
        boolean  eow;
        public  Node(){
            Children = new Node[26];
            eow = false;
            for(int i=0; i<26; i++){
                Children[i] = null;
            }
        }
    }

    public static Node   root = new Node();

    public static void  insert(String  words){
       Node   curr = root;
       for(int i=0; i<words.length(); i++){
         int idx = words.charAt(i) - 'a';
          if(curr.Children[idx] == null){
                  curr.Children[idx] = new Node();
          }
          if(i == words.length()-1){
               curr.Children[idx].eow = true;
          }
           curr = curr.Children[idx];

       }
    }


    public static  boolean   wordBreak(String word){
        if(word.length() == 0){
            return   true;
        }

         for(int i=1; i<=word.length(); i++){
            String firstPart  = word.substring(0,i);// here i rem9n excluded
            String secPart =  word.substring(i);
            if(search(firstPart) && wordBreak(secPart)){
                return true;
            }

            
         }
    return false;
    }



public static boolean StartsWith(String prefix){
     Node curr  = root;
     for(int i=0; i<prefix.length(); i++){
        int idx = prefix.charAt(i) -'a';
        if(curr.Children[idx] == null){
        return false;
        }
        curr  =  curr.Children[idx];
     }
     return true;
}






    public static  boolean search(String key){
         Node curr =  root; // because of root is static value it shoul not be change thees now onwards whenever we will require of thks root at that time we can simply use this curr
          
          for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i) -'a';
            if(curr.Children[idx] ==  null){
           return  false;
            }
            if(i == key.length() -1   &&  curr.Children[idx].eow == false){
            return false;                 
            }
            curr =  curr.Children[idx];
          }
          return curr.eow;
    }
    public static void main(String[] args) {


    /*
       // for insert and  search
            String words[] = {"the", "a", "there", "their", "any", "thee"};
     for(int i=0; i<words.length; i++){
        insert(words[i]);
     }
     System.out.println( search("there"));
         System.out.println( search("the"));
    System.out.println(search("mcso"));
     */
/*
 


String  words2[]  = {"i","like","sam","samsung","mobile"};
for(int i=0; i<words2.length; i++){
    insert(words2[i]);
 }
String key ="ilikesamsung";
   System.out.println(wordBreak(key));
 */

 String words2[] = {"apple","app","mango","man","women"};
 String key ="appee";
 for(int i=0; i<words2.length; i++){
    insert(words2[i]);
 }

   System.out.println(StartsWith(key));

   //


    }
}


/*
 
Each node in the Trie has an array of 
child nodes. Each index of this array represents a letter from 'a' to 'z
 */
