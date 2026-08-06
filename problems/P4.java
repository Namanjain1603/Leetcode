package problems;

public class P4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int t = n + m;
        int mid = 0, mid1 = 0;
        int c = t / 2;
        int i = 0, j = 0, k = 0;
        int[] arr = new int[m + n];
        if (t % 2 == 0) {
            while (i < m && j < n) {
                if (nums1[i] < nums2[j]) {
                    arr[k] = nums1[i];
                    i++;
                } else {
                    arr[k] = nums2[j];
                    j++;
                }
                k++;

                if (k == c) {
                    mid = arr[k - 1];

                }
                if (k == c + 1) {
                    mid1 = arr[k - 1];

                    return (mid + mid1) / 2.0;
                }
            }
            if (i < m) {
                for (int u = i; u < m; u++) {
                    arr[k] = nums1[u];
                    k++;

                    if (k == c) {
                        mid = arr[k - 1];

                    }
                    if (k == c + 1) {
                        mid1 = arr[k - 1];

                        return (mid + mid1) / 2.0;

                    }
                }
            }
            if (j < n) {
                for (int u = j; u < n; u++) {
                    arr[k] = nums2[u];
                    k++;

                    if (k == c) {
                        mid = arr[k - 1];

                    }
                    if (k == c + 1) {
                        mid1 = arr[k - 1];

                        return (mid + mid1) / 2.0;

                    }
                }
            }
        } else {
            while (i < m && j < n) {
                if (nums1[i] < nums2[j]) {
                    arr[k] = nums1[i];
                    i++;
                } else {
                    arr[k] = nums2[j];
                    j++;
                }
                k++;

                if (k - 1 == c) {
                    mid = arr[k - 1];

                    return mid;
                }
            }
            if (i < m) {
                for (int u = i; u < m; u++) {
                    arr[k] = nums1[u];
                    k++;

                    if (k - 1 == c) {
                        mid = arr[k - 1];

                        return mid;
                    }
                }
            }
            if (j < n) {
                for (int u = j; u < n; u++) {
                    arr[k] = nums2[u];
                    k++;

                    if (k - 1 == c) {
                        mid = arr[k - 1];

                        return mid;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums1 = { 10, 20 }, nums2 = { 30, 40, 50, 60, 70,80 };
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
