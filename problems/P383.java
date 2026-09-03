package problems;

public class P383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int arr[] = new int[26];
        int m = ransomNote.length();
        int n = magazine.length();
        for (int i = 0; i < n; i++) {
            char a = magazine.charAt(i);
            arr[a - 'a']++;
        }
        for (int i = 0; i < m; i++) {
            char a = ransomNote.charAt(i);
            if (arr[a - 'a'] == 0) {
                return false;
            }
            arr[a - 'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "a", magazine = "ab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
