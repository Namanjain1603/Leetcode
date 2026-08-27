package problems;

public class P415 {
    public static String addStrings(String num1, String num2) {
        StringBuilder str = new StringBuilder();
        int a = num1.length() - 1;
        int b = num2.length() - 1;
        int carry = 0;
        while (a >= 0 || b >= 0) {
            int m = 0, n = 0;
            if (a >= 0) {
                m = num1.charAt(a) - '0';
                a--;
            }
            if (b >= 0) {
                n = num2.charAt(b) - '0';
                b--;
            }
            int sum = m + n + carry;
            int digit = sum % 10;
            carry = sum / 10;
            str.append(digit);
        }
        if(carry==1){
            str.append(carry);
        }
        return str.reverse().toString();
    }
    public static void main(String[] args) {
        String num1 = "1", num2 = "9";
        System.out.println(addStrings(num1, num2));
    }
}
