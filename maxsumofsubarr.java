public class maxsumofsubarr {
    public static void maxsumarr(int nums[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = 1; j < nums.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum += nums[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }

            }
        }
        System.out.println("max sum of subarray is = " + maxsum);
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 3, 5, 1 };
        maxsumarr(nums);
    }
}
