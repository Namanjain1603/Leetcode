package problems;

public class P28 {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle, 0);
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(strStr(haystack, needle));
    }
}
