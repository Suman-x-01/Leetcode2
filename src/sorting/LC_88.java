package sorting;

public class LC_88 {

    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3,
                new int[]{2, 5, 6}, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];
        int p = 0, q = 0;

        for (int i = 0; i < m + n; i++) {

            if (p < m && q < n) {
                if (nums1[p] < nums2[q]) {
                    arr[i] = nums1[p];
                    p++;
                } else {
                    arr[i] = nums2[q];
                    q++;
                }
            } else if (p < m) {
                arr[i] = nums1[p];
                p++;
            } else {
                arr[i] = nums2[q];
                q++;
            }
        }

        // Copy the merged array back into nums1
        for (int i = 0; i < arr.length; i++) {
            nums1[i] = arr[i];
        }

        // Print the final result
        for (int value : nums1) {
            System.out.print(value + " ");
        }
    }
}