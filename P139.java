import java.util.List;

public class P139 {
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

    public boolean search(String word) {
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

    public boolean wordBreak(String s, List<String> wordDict) {
        for(int i=0;i<wordDict.size();i++){
            insert(wordDict.get(i));
        }
        if (s.length() == 0) {
            return true;
        }
        for (int i = 1; i <= s.length(); i++) {
            String fPart = s.substring(0, i);
            String sPart = s.substring(i);
            if (search(fPart) && wordBreak(sPart, wordDict)) {
                return true;
            }
        }
        return false;
    }
}
