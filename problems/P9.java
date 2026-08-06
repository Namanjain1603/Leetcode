package problems;

public class P9 {
    public static boolean isPalindrome(int x) {
        int og = x;
        int c = 0;
        while (x > 0) {
            c = c * 10 + x % 10;
            x = x / 10;
        }
        if (c == og)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.print(isPalindrome(x));
    }
}