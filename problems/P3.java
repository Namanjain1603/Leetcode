package problems;

public class P3 {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int j = 0, i = 0;
        int arr[] = new int[256];
        int max = 0;
        while (j < n) {
            int a = s.charAt(j);
            arr[a]++;
            while (arr[a] > 1) {
                arr[s.charAt(i)]--;
                i++;
            }
            if (j - i > max) {
                max = j - i + 1;
            }
            j++;
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}