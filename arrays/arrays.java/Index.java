class Array
 {
    public static int findIndex(int[] arr, int value)
 {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 6};
        int value = 9;
        int index = findIndex(numbers, value);
        if (index != -1)
            System.out.println("Index of " + value + ": " + index);
        else
            System.out.println(value + " not found in array.");
    }
}