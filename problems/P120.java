package problems;

import java.util.ArrayList;
import java.util.List;

public class P120 {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(n - 1).get(i);
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> t1 = new ArrayList<>();
        t1.add(2);
        List<Integer> t2 = new ArrayList<>();
        t2.add(3);
        t2.add(4);
        List<Integer> t3 = new ArrayList<>();
        t3.add(6);
        t3.add(5);
        t3.add(7);
        List<Integer> t4 = new ArrayList<>();
        t4.add(4);
        t4.add(1);
        t4.add(8);
        t4.add(3);
        triangle.add(t1);
        triangle.add(t2);
        triangle.add(t3);
        triangle.add(t4);
        System.out.println(minimumTotal(triangle));
    }
}
