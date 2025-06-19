class Average
{
    public static double averageArray(int[] arr)
{
        if (arr.length == 0) return 0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 6};
        System.out.println("Average: " + averageArray(numbers));
    }
}