public class P342 {
     public static boolean isPowerOfFour(int n) {
        n = pow4(n);
        if (n == 1) {
            return true;
        }
        return false;
    }

    public static int pow4(int n) {
        if (n == 1) {
            return 1;
        }
        if (n % 4 != 0 || n == 0) {
            return 0;
        }
        return pow4(n / 4);
    }
}
