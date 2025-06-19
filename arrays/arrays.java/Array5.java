import java.util.Arrays;
class Array5 {
    public static int[] removeElement(int[] arr, int value) {
        int count = 0;
        for (int num : arr) {
            if (num == value) count++;
        }
        if (count == 0) return arr;

        int[] newArr = new int[arr.length - count];
        int index = 0;
        for (int num : arr) {
            if (num != value) {
                newArr[index++] = num;
            }
        }
        return newArr;
    }