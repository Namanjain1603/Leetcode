import java.util.HashSet;

public class P217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> dupli = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (dupli.contains(nums[i])) {
                return true;
            } else {
                dupli.add(nums[i]);
            }
        }
        return false;
    }
}
