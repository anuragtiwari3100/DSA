import java.util.*;
public class HashMaCode {
    public static class MyHashMap<K, V> { 
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of key-value pairs
        private int N; // size of the bucket array
        private LinkedList<Node>[] bucket; // array of linked lists

        @SuppressWarnings("unchecked")
        public MyHashMap() {
            this.N = 4;
            this.bucket = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                this.bucket[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N; // hash function to calculate bucket index
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = bucket[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
               if(node .key == key){
                return di;
               }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void reHash() {
            LinkedList<Node>[] oldBucket = bucket;
            bucket = new LinkedList[N * 2];
            N = 2 * N;
            for (int i = 0; i < bucket.length; i++) {
                bucket[i] = new LinkedList<>();
            }
            // nodes -> add to new bucket
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                while (!ll.isEmpty()) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {  //TC=> O(lamda) => and  jsut b/c lamda remian lessor than conatant i.e O(1)
            int bi = hashFunction(key); // calculating bucket index
            int di = searchInLL(key, bi); // searching in the linked list at bucket index

            if (di != -1) {
                Node node = bucket[bi].get(di);   // bi  `bucket index`  is arr idx and di  `data index`  is linkdin idx
                node.value = value;
            } else {
                bucket[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) { // threshold value here 2.0
                reHash();
            }
        }

        public void print() {
            for (int i = 0; i < N; i++) {
                LinkedList<Node> ll = bucket[i];
                for (Node node : ll) {
                    System.out.println(node.key + " => " + node.value);
                }
            }
        }

        public boolean containsKey(K key){  //O(1)
          int bi = hashFunction(key);
           int di = searchInLL(key, bi);

           if(di != -1){
            return true;
           }else{
            return false;
           }
        }

        public V get (K key){ //O(1)
        int bi = hashFunction(key);
        int di = searchInLL(key, bi);
         if(di != -1){
            Node node = bucket[bi].get(di);
            return node.value;
         }else{
            return null;
         }
        }


  public V remove(K key){  //O(1)
      int bi = hashFunction(key);
      int di = searchInLL(key, bi);
      
      if(di != -1){
        Node node = bucket[bi].remove(di);
        n--;
        return node.value;
      }else{
        return null;
      }
  }

  //Returns  a arrayList of keys
  public ArrayList<K> keySet(){
    ArrayList<K> keys = new ArrayList<>();
    for(int i=0; i<bucket.length; i++){
        LinkedList<Node> ll = bucket[i];
        for(Node node :  ll){
            keys.add(node.key);
        }
       
    }
    return keys;
  }

    
  public boolean isEmpty(){
    return n==0;
  }







}


        public static void main(String[] args) {
            MyHashMap<String, Integer> hm = new MyHashMap<>();
            hm.put("India", 150);
            hm.put("Pakistan", 120);
            hm.put("Bangladesh", 140);
            hm.put("Nepal", 100);

            // hm.print(); // Print the key-value pairs
        //    System.out.println( hm.containsKey("Pakistan"));
    
//    System.out.println( hm.keySet());

//   System.out.println(hm.isEmpty());
 ArrayList<String> keys = hm.keySet();
 for(String key: keys){
    System.out.println(key);
 }

//    System.out.println(hm.get("Pakistan"));
// System.out.println(hm.get("Pakistan"));
    

    /*
         System.out.println(hm.remove("Pakistan"));
       hm.print();
     */




    }


}
    

