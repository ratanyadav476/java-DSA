public class DecToBin {
    public static void DecToBins(int nums) {
        int mynum = nums;
        int pow = 0;
        int BinNum = 0;
        while (nums > 0) {
            int rem = nums % 2;
            BinNum = BinNum + rem * (int) Math.pow(10, pow);
            pow++;
            nums = nums / 2;
        }
        System.out.println("the binary form of " + mynum + " is :" + BinNum);
    }

    public static void main(String[] args) {
        DecToBins(77);
    }
}
