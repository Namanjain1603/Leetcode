package problems;

public class P11 {
    public static int maxArea(int[] height) {
        int right = height.length - 1, left = 0, area = 0;
        while (right > left) {
            int h = Math.min(height[right], height[left]);
            int l = right - left;
            area = Math.max(area, h * l);
            if (height[right] < height[left]) {
                right--;
            } else {
                left++;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }
}
