package problems;

public class P405 {
    public static String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder ans = new StringBuilder();
        while (num != 0) {
            int digit = num & 15;
            ans.append(hex[digit]);
            num >>>= 4;
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        int num = 26;
        System.out.println(toHex(num));
    }
}
