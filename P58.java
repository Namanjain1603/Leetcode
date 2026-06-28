public class P58 {
    public int lengthOfLastWord(String s) {
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
}
