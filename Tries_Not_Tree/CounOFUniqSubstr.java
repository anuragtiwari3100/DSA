public class CounOFUniqSubstr {
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


    public static int countOfNodes(Node  root){
        Node  curr =  root;
        if(curr == null){
            return 0;
        }
        int count =0;
        for(int i=0; i<26; i++){  
            if(curr.Children[i] !=null){
                 count += countOfNodes(root.Children[i]);
            }
             
        }
         return count+1;
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

  public static String ans =" ";
  public static void  longestWord(Node root, StringBuilder temp){
    Node curr = root;
    if(root == null){
        return;
    }
     for(int i=0; i< 26; i++){
        if(curr.Children[i] != null && root.Children[i].eow == true){
               temp.append((char)(i+'a'));
                  if(temp .length() > ans.length()){
                    ans = temp.toString();  
                  }
                  longestWord(curr.Children[i], temp);
                 temp.deleteCharAt(temp.length()-1);
        }
     }
  }
   public  static void  main(String []  args){
/*
      String str = "ababa";
      for(int i=0; i<str.length(); i++)   {
         String  suffix = str.substring( i);    
         insert(suffix);
      }
      System.out.println(countOfNodes(root)); //dry run on apple
 */
   
 String  words[] ={"a","banana","app","appl","ap","apply","apple"};
     for(int i=0; i<words.length; i++){
        insert(words[i]);
     }
      longestWord(root,new StringBuilder(""));
      System.out.println(ans);
    }

}
