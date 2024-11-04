public class PrefixProblem {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static int findPrefixFrequency(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return 0; // Prefix not found
            }
            curr = curr.children[idx];
        }
        return curr.freq;
    }

    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duck", "dove"};

        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        // Example: Find the frequency of the prefix "do"
        String prefixToFind = "do";
        int prefixFrequency = findPrefixFrequency(prefixToFind);
        System.out.println("Frequency of prefix '" + prefixToFind + "': " + prefixFrequency);
    }
}
