import java.util.HashMap;

public class P290 {
    public boolean wordPattern(String pattern, String s) {
        String[] s_list = s.split(" ");
        if (s_list.length != pattern.length()) {
            return false;
        }
        HashMap<Character, String> patt = new HashMap<>();
        HashMap<String, Character> stri = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = s_list[i];
            if (!patt.containsKey(ch)) {
                patt.put(ch, word);
            } else {
                if (!(patt.get(ch).equals(word))) {
                    return false;
                }
            }
            if (!stri.containsKey(word)) {
                stri.put(word, ch);
            } else {
                if (!(stri.get(word).equals(ch))) {
                    return false;
                }
            }
        }
        return true;
    }
}
