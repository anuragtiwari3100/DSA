import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
class  Union {

            //Approach1 =>  T.C(O(m+n)) and S.C => O(n)
            public static  ArrayList<Integer> findUnion(int arr1[], int arr2[]){
                int n= arr1.length;
                int m = arr2.length;
            HashMap<Integer,Integer> freq = new HashMap<>();
            ArrayList<Integer> Union = new ArrayList<>();
            for(int i=0; i<arr1.length; i++){
            freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
            }
            for(int i=0; i<arr2.length; i++){
                freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
            }
            
            for(int x:freq.keySet()){
                Union.add(x);
            }
            return Union;
            }

            //Approach2 =>T.C(O(m+n)) and S.C => O(n)
                        static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
            HashSet <Integer> s=new HashSet<>();
            ArrayList < Integer > Union=new ArrayList<>();
            for (int i = 0; i < n; i++)
                s.add(arr1[i]);
            for (int i = 0; i < m; i++)
                s.add(arr2[i]);
            for (int it: s)
                Union.add(it);
            return Union;
            }



                    //Approach3=> T.C(O(m+n)) and S.C => O(1)
                            static ArrayList<Integer> findUnion3(int arr1[], int arr2[]) {
                                int n = arr1.length;
                                int m = arr2.length;
                                int i = 0, j = 0;
                                
                                ArrayList<Integer > Union=new ArrayList<>(); 
                                while (i < n && j < m) {
                                    if (arr1[i] <= arr2[j])
                                    {
                                    if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i]){
                                            Union.add(arr1[i]);
                                    }
                                    
                                    i++;
                                    } else 
                                    {
                                    if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j]){
                                            Union.add(arr2[j]);
                                    }
                                    
                                    j++; 
                                    }
                                }
                                while (i < n) 
                                {
                                    if (Union.get(Union.size()-1) != arr1[i])
                                    Union.add(arr1[i]);
                                    i++;
                                }
                                while (j < m) 
                                {
                                    if (Union.get(Union.size()-1) != arr2[j])
                                    Union.add(arr2[j]);
                                    j++;
                                }
                                return Union;
                                
                                    }



    public static void main(String[] args) {
//   int arr1[] = {1,2,3,4,5,9,10};
//   int arr2[] = {3,4,5,6,7,8};
int arr1[] = {5,2,4,6,8};
int arr2[] = {9,2,6,9,3,5};
   ArrayList<Integer> res =findUnion3(arr1, arr2);
   System.out.print(res+" ");
   
  
    }
}