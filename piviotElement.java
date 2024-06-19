/**
 * piviotElement
 */
public class piviotElement {
    public static int piviotElements(int arr[], int n) {
        int s = 0;
        int e = n - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] >= arr[0]) {
                s = mid + 1;
            } else {
                e = mid;
            }

        }
        return s;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 8, 1, 10, 17 };
        System.out.println(piviotElements(arr, 5));
    }
}