package gfg;
//https://www.geeksforgeeks.org/problems/peak-element/1
public class PeakElement {

    static void main() {
        System.out.println(peakElement(new int[]{1, 2, 4, 5, 7, 8, 3}));
    }
    public static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
    }
