package problems;

public class P3702 {
    public static int longestSubsequence(int[] nums) {
        int xor = 0;
        boolean nonzero=false;
        for (int num : nums) {
            xor ^= num;
            if(num!=0){
                nonzero=true;
            }
        }
        if (xor != 0) {
            return nums.length;
        }
        if(nonzero){
            return nums.length-1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 8, 5, 2, 1, 2, 3, 6, 5, 2, 0 };
        System.out.println(longestSubsequence(nums));
    }
}