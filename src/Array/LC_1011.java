package Array;

public class LC_1011 {
    static void main() {
        System.out.println(shipWithinDays(new int[]{3, 2, 2, 4, 1, 4}, 3));
    }

    public static int shipWithinDays(int[] weights, int days) {
//        find max and min capasity the ship can borrow
        int ans = 0;
        int max = 0, total = 0;
        for (int weight : weights) {
            if (weight > max) {
                max = weight;

            }
            total += weight;
        }
//        here we use max as left and total as right of binary search
        while (max <= total) {
            System.out.println("Min " + max + " max " + total);
            int mid = (max + total) / 2;
            int possibleDay = findDays(weights, mid);
            if (possibleDay <= days) {
                ans = mid;

                total = mid - 1;
//                System.out.println("pd<D "+total);
            } else {
                max = mid + 1;
//                System.out.println("PD>d "+max);
            }
        }
        return ans;
    }

    private static int findDays(int[] weights, int capasity) {

        int noOfDays = 1, total = 0;

        for (int weight : weights) {
            if (total + weight > capasity) {
                noOfDays++;
                total = 0;
            }
            total += weight;
        }
        return noOfDays;
    }


}
