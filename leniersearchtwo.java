public class leniersearchtwo {
    public static int fruitsearch(String fruits[], String key) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String fruits[] = { "banana", "mango", "orange", "apple", "papaya" };
        String key = "pineapple";
        int fruitplace = fruitsearch(fruits, key);
        if (fruitplace == -1) {
            System.out.println("fruit not found");

        } else {
            System.out.println("place of  " + key + " is  " + fruitplace);
        }
    }
}
