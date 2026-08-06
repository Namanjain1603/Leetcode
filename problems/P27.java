package problems;

public class P27 {
    public static int removeElement(int[] nums, int val) {
        int[] arr = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                arr[k] = nums[i];
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            nums[i] = arr[i];
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}
