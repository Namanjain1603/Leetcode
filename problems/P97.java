package problems;

public class P97 {
    public static boolean isInterleave(String s1, String s2, String s3) {
        int n = s3.length();
        int m = s1.length();
        int t = s2.length();
        if (n != m + t) {
            return false;
        }
        int j = 0; // s3
        int i = 0; // s1
        int k = 0; // s2
        while (j < n) {
            if (i < m && s3.charAt(j) == s1.charAt(i)) {
                i++;
            } else if (k < t && s3.charAt(j) == s2.charAt(k)) {
                k++;
            } else {
                return false;
            }
            System.out.println(s3.charAt(j));
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
        System.out.println(isInterleave(s1, s2, s3));
    }
}
