package problems;

public class P171 {

    public static int titleToNumber(String columnTitle) {
        int sum = 0, n = columnTitle.length(), j = 0;
        for (int i = n - 1; i >= 0; i--) {
            int a = (int) (columnTitle.charAt(i) - 'A' + 1);
            sum = sum + (int) Math.pow(26, j) * a;
            j++;
        }
        return sum;
    }

    public static void main(String[] args) {
        String columnTitle = "ZY";
        System.out.println(titleToNumber(columnTitle));
    }
}