package Array;

import java.util.Arrays;

public class LC_1482 {
    static void main() {
        System.out.println(minDays(new int[]{7, 7, 7, 7, 12, 7, 7}, 2, 3));
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        int maxdays = 0;
        if (bloomDay.length < (m * k)) {
            return -1;
        }

        for (int i : bloomDay) {
            maxdays = Math.max(maxdays, i);
        }

        int minDays=1;
        while(minDays<maxdays){
            int mid = minDays + (maxdays - minDays) / 2;

            int res = find(bloomDay, mid, m, k);

            if (res != -1) {
                // This day works.
                // Try an earlier day.
                maxdays = mid;
            } else {
                // This day doesn't work.
                // Need more days.
                minDays = mid + 1;
            }
        }




        return minDays;
    }

    //    1,8,6,2,5,4,8,3,7

    public static int find(int[] arr, int day, int m, int k) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= day) {

                count++;

                if (count == k) {
                    m--;
                    count = 0;
                }

            } else {
                count = 0;
            }

            if (m == 0) {
                return day;
            }
        }

        return -1;
    }
}
