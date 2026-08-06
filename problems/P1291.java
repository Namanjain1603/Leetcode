package problems;

import java.util.ArrayList;
import java.util.List;

public class P1291 {
    static List<Integer> list = new ArrayList<Integer>();

    public static List<Integer> sequentialDigits(int low, int high) {
        int count = 0;
        while (low > 0) {
            low = low / 10;
            count++;
        }
        for (int i = 0; i < 36; i++) {
            int n = helper(count);
            if (n < high) {
                list.add(n);
            } else {
                return list;
            }
        }
        return list;
    }

    public static int helper(int length) {
        int n = 0;
        int count = 1;
        for (int i = 0; i < length; i++) {
            n = n * 10 + count;
            count++;
        }
        return n;
    }
}
