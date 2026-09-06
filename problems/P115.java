package problems;

public class P115 {

    static int[][] dp;

    public static int solve(String s, String t, int i, int j) {

        if (j == t.length()) {
            return 1;
        }

        if (i == s.length()) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (s.charAt(i) == t.charAt(j)) {
            return dp[i][j] = solve(s, t, i + 1, j + 1) + solve(s, t, i + 1, j);
        }

        return dp[i][j] = solve(s, t, i + 1, j);
    }

    public static int numDistinct(String s, String t) {

        dp = new int[s.length()][t.length()];

        for (int i = 0; i < s.length(); i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        return solve(s, t, 0, 0);
    }

    public static void main(String[] args) {
        String s = "rabbbit", t = "rabbit";
        System.out.println(numDistinct(s, t));
    }
}
