class Armstrong {
    public static void main(String[] args) {
        int num = 153, sum = 0, temp = num;
        
        while(temp > 0) {
            int digit = temp % 10;
            sum = sum + (digit * digit * digit); 
            temp = temp / 10;
        }

        if(sum == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is NOT an Armstrong number.");
    }
}
