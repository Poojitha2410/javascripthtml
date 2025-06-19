class Encloseoprtator {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 7, 7};
        int target = 3;

        System.out.println("Checking numbers equal or not equal to " + target + ":");

        for (int num : numbers) {
            if (num == target) {
                System.out.println(num + " == " + target + " -> Equal");
            } else {
                System.out.println(num + " != " + target + " -> Not equal");
            }
        }
    }
}
