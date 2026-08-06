public class P1475 {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        // int ans[] = new int[n];
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            while (prices[i] < prices[j] && j < n - 1) {
                j++;
            }
            if (prices[i] >= prices[j]) {

                prices[i] -= prices[j];
            }
        }
        return prices;
    }
}
