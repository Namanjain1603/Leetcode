public class P268 {
    public int missingNumber(int[] nums) {
        int count = 0;
        int found = 0;
        int n = nums.length;
        while (count <= n) {
            for (int i = 0; i < n; i++) {
                if (nums[i] == count) {
                    found = 1;
                }
            }
            if (found == 0) {
                return count;
            }
            found = 0;
            count++;
        }
        return -1;
    }
}
