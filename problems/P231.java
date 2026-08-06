public class P231 {
    public boolean isPowerOfTwo(int n) {
        n = powww(n);
        if (n == 1) {
            return true;
        }
        return false;
    }

    public static int powww(int n) {
        if (n == 1) {
            return 1;
        }
        if (n % 2 != 0 || n==0) {
            return 0;
        }
        return powww(n / 2);
    }
}
