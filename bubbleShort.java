/**
 * bubbleShort
 */
public class bubbleShort {
    public static void bubbleShortAlgorithm(int arr[]) {
        for (int term = 0; term < arr.length - 1; term++) {
            for (int j = 0; j < arr.length - 1 - term; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printbubbles(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        bubbleShortAlgorithm(arr);
        printbubbles(arr);
    }
}