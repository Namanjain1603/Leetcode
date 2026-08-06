package problems;

public class P34 {
    public static int[] searchRange(int[] nums, int target) {
        int i = 0, j = nums.length - 1, v = 0;
        int[] ans = new int[2];
        while (i <= j) {
            if (nums[i] == target) {
                ans[v] = i;
                i++;
                v++;
            } else {
                i++;
            }
            if (nums[j] == target) {
                ans[v] = j;
                j--;
                v++;
            } else {
                j--;
            }
            if (v == 2) {
                return ans;
            }
        }
        int as[] = { -1, -1 };
        return as;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] a = searchRange(nums, target);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
