package problems;

public class P3903 {
    public static int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int a = 0;
            int b = 0;
            for (int t = 0; t < i; t++) {
                if (max < nums[t]) {
                    max = nums[t];
                    b = t;
                }
            }
            for (int t = i; t < n; t++) {
                if (min > nums[t]) {
                    min = nums[t];
                    a = t;
                }
            }
            if (nums[b] - nums[a] <= k) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 5, 0, 1, 4 }, k = 3;
        System.out.println(firstStableIndex(nums, k));
    }
}

// Example 1:

// Input: nums = [5,0,1,4], k = 3

// Output: 3

// Explanation:

// At index 0: The maximum in [5] is 5, and the minimum in [5, 0, 1, 4] is 0, so
// the instability score is 5 - 0 = 5.
// At index 1: The maximum in [5, 0] is 5, and the minimum in [0, 1, 4] is 0, so
// the instability score is 5 - 0 = 5.
// At index 2: The maximum in [5, 0, 1] is 5, and the minimum in [1, 4] is 1, so
// the instability score is 5 - 1 = 4.
// At index 3: The maximum in [5, 0, 1, 4] is 5, and the minimum in [4] is 4, so
// the instability score is 5 - 4 = 1.
// This is the first index with an instability score less than or equal to k =
// 3. Thus, the answer is 3.
// Example 2:

// Input: nums = [3,2,1], k = 1

// Output: -1

// Explanation:

// At index 0, the instability score is 3 - 1 = 2.
// At index 1, the instability score is 3 - 1 = 2.
// At index 2, the instability score is 3 - 1 = 2.
// None of these values is less than or equal to k = 1, so the answer is -1.
// Example 3:

// Input: nums = [0], k = 0

// Output: 0

// Explanation:

// At index 0, the instability score is 0 - 0 = 0, which is less than or equal
// to k = 0. Therefore, the answer is 0.