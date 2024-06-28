/**
 * insertionSort
 */
public class insertionSort {

    public static void insertionSorts(int arr[], int n) {
        // code here

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

    }

    public static void insert(int arr[], int n) {
        // Your code here
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 6, 1, 2, 8, 11 };
        insertionSorts(arr, 0);
        insert(arr, 7);
    }
}