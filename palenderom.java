public class palenderom {
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

    public static void main(String[] args) {
        if (Printpalendrome(12322)) {
            System.out.println("your number  is  a palendrome number");
        } else {
            System.out.println("your number is not palendrome");
        }
    }
}
