import java.util.HashSet;

public class P202 {
    public static int nextnum(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n = n / 10;
        }
        return sum;
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> num = new HashSet<>();
        while (!num.contains(n)) {
            num.add(n);
            n = nextnum(n);
        }
        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }
}
