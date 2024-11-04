import java.util.*;
public class HashMapCode {
    public static  class MyHashMap<K,V>{
    private class Node{
        K key;
        V value;

        public Node(K key, V value){
            this.key = key;
            this.value =  value;
        }

    }
    private int n; // shows size of all nodes
    private int N; // shos size of  bucjket array

   private LinkedList<Node>[] bucket;
   public MyHashMap(){
    this.N =4;
    this.bucket  = new LinkedList[N];
     for(int i=0; i<N; i++){
    this.bucket[i] = new LinkedList<>();
   }    
   }
   

  
   public    void   put(K key, V value){       // o(lamda)
     int bi = hashFunction(key);
     int  di = SearchInLL(key, bi);  
     
     if( di != -1){
      Node node = bucket[bi].get(di);
      node.value = value;
     }else{
        bucket[bi].add(new  Node(key,value));
         n++;
     }
      
     double lamda  = (double) n/N;
     if( lamda > 2.0){   //thres hold value here 2.0
      reHash();
     }
   }

   @SuppressWarnings("unchecked")
   private  void  reHash(){
    LinkedList<Node> oldBuccket[] = bucket;
    bucket = new LinkedList[N*2];
    N = 2*N;
    for(int i=0; i<bucket.length; i++){
        bucket[i] = new LinkedList<>();
    }
        //nodes => add to bucket
     for(int i=0; i<oldBuccket.length; i++){
        LinkedList<Node> ll = oldBuccket[i];
        for(int j=0; j<ll.size(); j++){
            Node node  =  ll.remove();
            put(node.key , node.value);

        }
     }
   }
    

   public int  hashFunction(K key){
    int hc = key.hashCode();
       return Math.abs(hc)% N;

 }
 public int SearchInLL(K key , int bi){
    int di = 0;
      LinkedList<Node> ll = bucket[bi];
      for(int i=0; i<ll.size(); i++){
        Node node = ll.get(i);
        if(node.key == key){
            return di;
        }
        di ++;
      }
      return -1;
 }

  public boolean  containKey(K key){  //O(1)
      int bi = hashFunction(key);
      int di = SearchInLL(key,bi);
       
      if(di != -1){
        return false;
      }else{
        return true;
      }
  }
  public  V get(K key){
     int bi = hashFunction(key);
     int di  =  SearchInLL(key, bi);
      if( di != -1){
        Node node = bucket[bi].get(di);
         return node.value;
      }else{
        return null;
      }
  }

  public  V remove (K key){  //O(lamda or 1)
    int bi = hashFunction(key);
    int di = SearchInLL(key, bi);
     
    if(di != -1){
         Node node = bucket[bi].remove(di);
         n--;
         return node.value;
    }else{
        return null;
    }
  }

  public ArrayList<K> keySet(){
    ArrayList<K> keys = new ArrayList<>();
    
     for(int i=0; i<bucket.length; i++){
        LinkedList<Node> ll = bucket[i];
        for(Node node : ll){
          keys.add(node.key);
        }
    }
    return keys;
  }
   public boolean  isEmpty(){
    return n==0;
   }
   }
   public static void main(String[] args) {
    MyHashMap<String, Integer> hm = new MyHashMap<>();
    hm.put("India", 150);
    hm.put("Pakistan", 120);
    hm.put("Bangladesh", 140);
    hm.put("Nepal", 100);
    ArrayList<String> keys = hm.keySet();
    for(String key : keys ){
      System.out.println(key);
   }
   System.out.println();
   System.out.println(hm.get("India"));
   System.out.println(hm.remove("India")+"  is the key that  Removed...");
   System.out.println(hm.get("India"));
}
}
