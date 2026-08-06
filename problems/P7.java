package problems;

public class P7 {
    public static int reverse(int x) {
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return 0;
        }
        int sum = 0;
        while (x != 0) {
            int d = x % 10;
            if (sum > Integer.MAX_VALUE / 10 || sum < Integer.MIN_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && d > 7)
                    || (sum == Integer.MIN_VALUE / 10 && d < -8)) {
                return 0;
            }
            sum = sum * 10 + d;
            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int x = 321;
        System.out.print(reverse(x));
    }
}
