package problems;

public class P5 {
    public static String longestPalindrome(String s) {
        int n = s.length() - 1;
        String str = "";
        for (int i = n; i >= 0; i--) {
            str += s.charAt(i);
        }
        int i = 0, j = 0;
        String ans = "", sans = "";
        while (i < n && j < n) {
            if (s.charAt(i) == str.charAt(j)) {
                ans += s.charAt(i);
                i++;
            } else {
                if (ans.length() > sans.length()) {
                    sans = ans;
                }
                ans = "";
            }
            j++;
        }
        return sans;
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
