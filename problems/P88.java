package problems;

public class P88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                i++;
            } else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        if (i < m) {
            for (int u = i; u < m; u++) {
                arr[k] = nums1[u];
                k++;
            }
        }
        if (j < n) {
            for (int u = j; u < n; u++) {
                arr[k] = nums2[u];
                k++;
            }
        }
        for (int u = 0; u < m + n; u++) {
            nums1[u] = arr[u];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 }, nums2 = { 2, 5, 6 };
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
