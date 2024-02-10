public class reversearray {
    public static void reverse(int numbers[]) {
        int firsth = 0;
        int last = numbers.length - 1;
        while (firsth < last) {
            int temp = numbers[last];
            numbers[last] = numbers[firsth];
            numbers[firsth] = temp;
            firsth++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 8, 6, 4, 9, 5, 4, 7 };
        reverse(numbers);
        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println();
    }
}