public class P26 {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int news[] = new int[nums.length];

        if (nums.length > 1) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] != nums[i + 1]) {
                    news[k] = nums[i];
                    k++;
                }
            }
            news[k] = nums[nums.length - 1];

            for (int i = 0; i < nums.length; i++) {
                nums[i] = news[i];
            }
            return k + 1;
        } else {
            return 1;
        }
    }
}
