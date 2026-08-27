package problems;

import java.util.HashMap;

public class P347 {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int[] arr = new int[k];
        for (int i = 0; i < arr.length; i++) {
            int freq = -1;
            int freqnum = -1;
            for (int num : map.keySet()) {
                if (map.get(num) > freq) {
                    freq = map.get(num);
                    freqnum = num;
                }
            }
            arr[i] = freqnum;
            map.remove(freqnum);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 2, 1, 2, 3, 1, 3, 2 };
        int k = 2;
        int[] arr = topKFrequent(nums, k);
        for (int num : arr) {
            System.out.println(num);
        }
    }

}
