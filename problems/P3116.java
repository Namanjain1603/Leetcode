package problems;

import java.util.ArrayList;

public class P3116 {
    public static long findKthSmallest(int[] coins, int k) {
        // ArrayList<Integer> list = new ArrayList<>();
        // for (int num : coins) {
        //     for (int i = 1; i <= k; i++) {
        //         list.add(num * i);
        //     }
        // }
        // list.sort(null);
        // for (int i = 0; i < list.size() - 1; i++) {
        //     if (list.get(i) == list.get(i + 1)) {
        //         list.remove(i);
        //     }
        // }
        // return list.get(k - 1);
        int n = coins.length;
        int[] multiply_count = new int[n];
        while(true){
            
        }   
    }
    
    public static void main(String[] args) {
        int[] coins = { 4, 8, 3, 1 };
        int k = 10;
        System.out.println(findKthSmallest(coins, k));
    }
}

// for (int num : list) {
// System.out.println(num);
// }
// return 0;
// Example 1:

// Input: coins = [3,6,9], k = 3

// Output: 9

// Explanation: The given coins can make the following amounts:
// Coin 3 produces multiples of 3: 3, 6, 9, 12, 15, etc.
// Coin 6 produces multiples of 6: 6, 12, 18, 24, etc.
// Coin 9 produces multiples of 9: 9, 18, 27, 36, etc.
// All of the coins combined produce: 3, 6, 9, 12, 15, etc.

// Example 2:

// Input: coins = [5,2], k = 7

// Output: 12

// Explanation: The given coins can make the following amounts:
// Coin 5 produces multiples of 5: 5, 10, 15, 20, etc.
// Coin 2 produces multiples of 2: 2, 4, 6, 8, 10, 12, etc.
// All of the coins combined produce: 2, 4, 5, 6, 8, 10, 12, 14, 15, etc.