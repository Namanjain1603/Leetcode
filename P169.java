import java.util.HashMap;
import java.util.Map;

public class P169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> major = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (major.get(nums[i]) == null) {
                major.put(nums[i], 1);
            } else {
                major.put(nums[i], major.get(nums[i]) + 1);
            }
        }
        int ans = 0;
        int freq = 0;
        for (Map.Entry<Integer, Integer> e : major.entrySet()) {
            if (freq < e.getValue()) {
                ans = e.getKey();
                freq = e.getValue();
            }
        }
        return ans;
    }
}
