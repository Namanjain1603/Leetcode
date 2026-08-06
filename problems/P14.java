package problems;

import topics.*;

public class P14 {

    public static String count(TrieNode root) {
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

    public static String longestCommonPrefix(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            TrieNode.insert(strs[i]);
        }
        return count(TrieNode.root);
    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.print(longestCommonPrefix(strs));
    }
}
