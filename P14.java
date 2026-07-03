public class P14 {
    class TrieNode {
        TrieNode[] children;
        boolean eow;

        public TrieNode() {
            children = new TrieNode[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    TrieNode root = new TrieNode();

    public void insert(String word) {
        if (word.length() == 0) {
            root.eow = true;
            return;
        }
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

    // String[] strs = { "flower", "flow", "flight" };

    public String count(TrieNode root) {
        StringBuilder str = new StringBuilder();
        int idx = 0;
        int countW = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                idx = i;
                countW++;
            }
        }
        if (countW == 1 && root.eow == false) {
            str = str.append((char) ('a' + idx));
            str.append(count(root.children[idx]));
        }
        return str.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            insert(strs[i]);
        }
        return count(root);
    }
}
