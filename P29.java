public class P29 {
    public int divide(int dividend, int divisor) {
        int quo = 0;
        if (dividend < 0) {
            dividend = Math.abs(dividend);
            divisor = Math.negateExact(divisor);
        }
        while (dividend > divisor && dividend > 0) {
            
            if (quo > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (quo < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
    }
}
