package problems;

public class P35 {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }
}
