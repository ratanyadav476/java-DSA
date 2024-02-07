public class leaniersearch {
    public static int leanirsearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 7, 5, 6, 10, 45, 34 };
        int key = 45;
        int index = leanirsearch(numbers, key);
        if (index == -1) {
            System.out.println("num not found ");
        } else {
            System.out.println("index of this key is  " + index);
        }
    }
}