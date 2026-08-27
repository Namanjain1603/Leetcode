package problems;

import java.util.HashMap;

public class P3471 {
    public static int largestInteger(int[] nums, int k) {
        if (k == 1) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int ans = -1;
            for (int num : nums) {
                if (map.get(num) == 1) {
                    ans = Math.max(ans, num);
                }
            }
            return ans;
        }
        if (k >= nums.length) {
            int max = 0;
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return max;
        }
        int first = nums[0], last = nums[nums.length - 1];
        int first_count = 0, last_count = 0;
        for (int num : nums) {
            if (num == first) {
                first_count++;
            }
            if (num == last) {
                last_count++;
            }
        }
        int ans = -1;
        if (first_count == 1) {
            ans = Math.max(ans, first);
        }
        if (last_count == 1) {
            ans = Math.max(ans, last);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 7, 4, 5, 6, 8, 2, 3, 4, 1 };
        int k = 1;
        System.out.println(largestInteger(nums, k));
    }
}
