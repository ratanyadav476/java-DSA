
public class BinToDecimal {

    public static void ChngBintoDec(int n) {
        int mynun = n;
        int pow = 0;
        int DecNum = 0;
        while (n > 0) {
            int lastDig = n % 10;
            DecNum = DecNum + lastDig * (int) Math.pow(2, pow);
            pow++;
            n = n / 10;
        }
        System.out.println("the decimal of " + mynun + " is :" + DecNum);
    }

    public static void main(String[] args) {
        ChngBintoDec(1111110111);
    }

}