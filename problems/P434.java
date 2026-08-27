package problems;

public class P434 {
    public static int countSegments(String s) {
        s=s.strip();
        if (s.equals("")) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        String s = "          ";
        System.out.println(countSegments(s));
    }
}

// Input: s = "Hello, my name is John"
// Output: 5
// Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]