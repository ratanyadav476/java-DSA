/**
 * bubbleShort1
 */
public class bubbleShort1 {
    public static void printbubbleshort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            // outer loop
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void print(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 3, 8, 1, 2 };
        printbubbleshort(arr, 6);
        print(arr, 6);
    }
}