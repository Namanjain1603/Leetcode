package problems;

public class P58 {
    public static int lengthOfLastWord(String s) {
        s = s.strip();
        int n = s.length();
        int c = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return c;
            }
            c++;
        }
        return c;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
