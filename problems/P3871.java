package problems;

public class P3871 {
    public static long countCommas(long n) {
        if (n < Math.pow(10, 3))
            return 0;
        if (n < Math.pow(10, 6))
            return (n - (long) Math.pow(10, 3) + 1);
        if (n < Math.pow(10, 9))
            return 2 * (n - (long) Math.pow(10, 6) + 1) + countCommas((long) Math.pow(10, 6) - 1);
        if (n < Math.pow(10, 12))
            return 3 * (n - (long) Math.pow(10, 9) + 1) + countCommas((long) Math.pow(10, 9) - 1);
        if (n < Math.pow(10, 15))
            return 4 * (n - (long) Math.pow(10, 12) + 1) + countCommas((long) Math.pow(10, 12) - 1);
        return 4 + countCommas((long) Math.pow(10, 15) - 1);
    }

    public static void main(String[] args) {
        System.out.println(countCommas(11000));
    }
}