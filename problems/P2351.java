package problems;

import java.util.ArrayList;

public class P2351 {
    public static char repeatedCharacter(String s) {
        ArrayList<Character> ch = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (ch.contains(s.charAt(i))) {
                return s.charAt(i);
            }
            ch.add(s.charAt(i));
        }
        return ' ';
    }

    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }
}
