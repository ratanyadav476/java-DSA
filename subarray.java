public class subarray {
    public static void printsubarray(int elements[]) {
        int totalsubarrays = 0;
        for (int i = 1; i < elements.length; i++) {
            int start = i;
            for (int j = i; j < elements.length; j++) {
                int end = j;
                for (int k = start; k < end; k++) {
                    System.out.print(elements[k] + " ");
                }
                totalsubarrays++;
                System.err.println();
            }
            System.err.println();
        }
        System.out.println("total sub arrays are  " + totalsubarrays);
    }

    public static void main(String[] args) {
        int elements[] = { 2, 4, 6, 8, 10, 12, 14 };
        printsubarray(elements);
    }
}