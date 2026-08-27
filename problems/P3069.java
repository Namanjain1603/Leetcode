package problems;

import java.util.ArrayList;

public class P3069 {
    public static int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (arr1.getLast() > arr2.getLast()) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }
        int i = 0;
        for (int num : arr1) {
            nums[i] = num;
            i++;
        }
        for (int num : arr2) {
            nums[i] = num;
            i++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, 3 };
        nums = resultArray(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}

// Input: nums = [2,1,3]
// Output: [2,3,1]
// Explanation: After the first 2 operations, arr1 = [2] and arr2 = [1].
// In the 3rd operation, as the last element of arr1 is greater than the last
// element of arr2 (2 > 1), append nums[3] to arr1.
// After 3 operations, arr1 = [2,3] and arr2 = [1].
// Hence, the array result formed by concatenation is [2,3,1].