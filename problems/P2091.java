package problems;

public class P2091 {
    public static int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int i = -1, j = -1;
        for (int k = 0; k < n; k++) {
            int num = nums[k];
            if (num < min) {
                min = num;
                i = k;
            }
            if (num > max) {
                max = num;
                j = k;
            }
        }
        int a = Math.min(i, j);
        int b = Math.max(i, j);
        int m1 = b + 1;
        int m2 = n - b + a + 1;
        int m3 = n - a;
        return Math.min(Math.min(m1, m2), m3);
    }

    public static void main(String[] args) {
        int[] nums = { 2, 10, 7, 5, 4, 1, 8, 6 };
        System.out.println(minimumDeletions(nums));
    }
}

// Example 1:

// Input: nums = [2,10,7,5,4,1,8,6]
// Output: 5
// Explanation:
// The minimum element in the array is nums[5], which is 1.
// The maximum element in the array is nums[1], which is 10.
// We can remove both the minimum and maximum by removing 2 elements from the
// front and 3 elements from the back.
// This results in 2 + 3 = 5 deletions, which is the minimum number possible.
// Example 2:

// Input: nums = [0,-4,19,1,8,-2,-3,5]
// Output: 3
// Explanation:
// The minimum element in the array is nums[1], which is -4.
// The maximum element in the array is nums[2], which is 19.
// We can remove both the minimum and maximum by removing 3 elements from the
// front.
// This results in only 3 deletions, which is the minimum number possible.
// Example 3:

// Input: nums = [101]
// Output: 1
// Explanation:
// There is only one element in the array, which makes it both the minimum and
// maximum element.
// We can remove it with 1 deletion.