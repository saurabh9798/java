public class Classroom {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i <26; i++) {
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word) { // O(h)
        Node curr = root;
        for(int level = 0; level< word.length(); level++) 
        {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children [idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String key) { // O(h)
        Node curr = root;
        for(int level = 0; level< key.length(); level++) 
        {
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    // word break code 
    public static boolean wordbreak(String key) {
        if (key.length() == 0) {
            return true;
        } 
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0,i)) && wordbreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
    //    String words[] = {"the", "a","there","any","thee"}; 
    //    for (int i = 0; i < words.length; i++) {
    //         insert(words[i]);
    //    }
    //    System.err.println(search("thee"));
    //    System.err.println(search("thor"));
        String arr[] = {"i","like","sam","samsung","mobile","ice"};
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        String key = "ilikemoblile";
        System.out.println(wordbreak(key));
    }
}
 