public class P326 {
    public static boolean isPowerOfThree(int n) {
        n = pow3(n);
        if (n == 1) {
            return true;
        }
        return false;
    }

    public static int pow3(int n) {
        if (n == 1) {
            return 1;
        }
        if (n % 3 != 0 || n == 0) {
            return 0;
        }
        return pow3(n / 3);
    }
}
