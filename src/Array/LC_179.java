package Array;

import java.util.Objects;

public class LC_179 {
    static void main() {
        System.out.println(largestNumber(new int[]{3,30,34,5,9}));
    }
    public static String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Sort using our special comparison
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                String s1 = arr[j] + arr[j + 1];
                String s2 = arr[j + 1] + arr[j];

                if (s1.compareTo(s2) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        String res = "";

        for (String s : arr) {
            res += s;
        }

        return res;
    }
    }
