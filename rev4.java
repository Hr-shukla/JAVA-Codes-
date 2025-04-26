class rev4 {
    public static void main(String[] args) {
        int number = 12345;
        int reversed = 0;
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println(reversed);
    }
}
