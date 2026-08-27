package problems;

import java.util.HashSet;

public class P3718 {
    public static int missingMultiple(int[] nums, int k) {
        HashSet<Integer> n = new HashSet<>();
        for (int num : nums) {
            n.add(num);
        }
        int i = 1;
        while (true) {
            if (!n.contains(i * k)) {
                return i * k;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int nums[] = { 8,2,3,4,6 }, k = 2;
        System.out.println(missingMultiple(nums, k));
    }
}

// Example 1:

// Input: nums = [8,2,3,4,6], k = 2

// Output: 10

// Explanation:

// The multiples of k = 2 are 2, 4, 6, 8, 10, 12... and the smallest multiple
// missing from nums is 10.

// Example 2:

// Input: nums = [1,4,7,10,15], k = 5

// Output: 5

// Explanation:

// The multiples of k = 5 are 5, 10, 15, 20... and the smallest multiple missing
// from nums is 5.