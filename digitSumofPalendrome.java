public class digitSumofPalendrome {
    public static boolean Printpalendrome(int num) {
        int palendrom = num;
        int reverse = 0;
        while (palendrom != 0) {
            int remender = palendrom % 10;
            reverse = reverse * 10 + remender;
            palendrom = palendrom / 10;

        }
        if (num == reverse) {
            return true;
        } else {
            return false;
        }

    }

    public static int DigitsSum(int n) {
        if (Printpalendrome(123)) {

            int SumOfDigit = 0;
            while (n > 0) {
                int lastdigit = n % 10;
                SumOfDigit += lastdigit;
                n /= 10;

            }
            return SumOfDigit;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(DigitsSum(121));

    }
}
