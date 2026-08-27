package problems;

public class P3090 {
    public static int maximumLengthSubstring(String s) {
        int n = s.length();
        int i = 0, j = 0;
        int[] arr = new int[26];
        int max = 0;
        while (j < n) {
            int a = s.charAt(j) - 'a';
            arr[a]++;
            while (arr[a] > 2) {
                arr[s.charAt(i) - 'a']--;
                i++;
            }
            j++;
            if (j - i > max) {
                max = j - i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "aaaa";
        System.out.println(maximumLengthSubstring(s));
    }
}
