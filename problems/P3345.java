package problems;

public class P3345 {
    public static int smallestNumber(int n, int t) {
        int pd = 1;
        int og = n;
        while (n > 0) {
            int d = n % 10;
            pd *= d;
            n /= 10;
        }
        if (pd % t == 0) {
            return og;
        } else {
            return smallestNumber(og + 1, t);
        }
    }

    public static void main(String[] args) {
        int n = 15, t = 2;
        System.out.println(smallestNumber(n, t));
    }
}
