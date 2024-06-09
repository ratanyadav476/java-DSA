public class Solution1 {

    static long factorial(int N) {
        long f = 1;
        for (int i = 1; i <= N; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
