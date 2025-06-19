 public class Array1 {
    public static void main(String[] args) {
       
        int [ ] numbers = {5, 10, 15, 20};

   
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        System.out.println("The total is: " + total);
    }
}
