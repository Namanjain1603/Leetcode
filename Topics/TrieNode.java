package topics;

public class TrieNode {
    public TrieNode[] children;
    public boolean eow;

    public TrieNode() {
        children = new TrieNode[26];
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
        eow = false;
    }

    public static TrieNode root = new TrieNode();

    public static void insert(String word) {
        TrieNode head = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            TrieNode curr = head.children[idx];
            if (curr == null) {
                curr = new TrieNode();
                head.children[idx] = curr;
            }
            if (i == word.length() - 1) {
                curr.eow = true;
            }
            head = curr;
        }
    }

    public static boolean search(String word) {
        TrieNode head = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            TrieNode curr = head.children[idx];
            if (curr == null) {
                return false;
            }
            if (i == word.length() - 1 && curr.eow == false) {
                return false;
            }
            head = curr;
        }
        return true;
    }

    // public static boolean wordBreak(String word) {
    // if (word.length() == 0) {
    // return true;
    // }
    // for (int i = 1; i <= word.length(); i++) {
    // String fPart = word.substring(0, i);
    // String sPart = word.substring(i);
    // if (search(fPart) && wordBreak(sPart)) {
    // return true;
    // }
    // }
    // return false;
    // }

    // public static boolean startWith(String part) {
    // TrieNode head = root;
    // for (int i = 0; i < part.length(); i++) {
    // int idx = part.charAt(i) - 'a';
    // TrieNode curr = head.children[idx];
    // if (curr == null) {
    // return false;
    // }
    // head = curr;
    // }
    // return true;
    // }

    // public static int uniqSubStringCount(TrieNode root) {
    // int count = 0;
    // for (int i = 0; i < 26; i++) {
    // if (root.children[i] != null) {
    // count += uniqSubStringCount(root.children[i]);
    // }
    // }
    // return count + 1;
    // }

    // static String str = "";

    // public static void longestPrefix(TrieNode root, StringBuilder temp) {
    // for (int i = 0; i < 26; i++) {
    // if (root.children[i] != null && root.children[i].eow == true) {
    // temp.append((char) ('a' + i));
    // if (temp.length() > str.length()) {
    // str = temp.toString();
    // }
    // longestPrefix(root.children[i], temp);
    // temp.deleteCharAt(temp.length() - 1);
    // }
    // }
    // }

    // public static void main(String[] args) {
    // String[] words = { "a", "banana", "app", "appl", "ap", "apply" };
    // for (int i = 0; i < words.length; i++) {
    // insert(words[i]);
    // }
    // longestPrefix(root, new StringBuilder(""));
    // System.out.println(str);
    // }
}