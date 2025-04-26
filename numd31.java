class numd31 {
    public static void main(String[] args) {
        int number = 123456;
        int digits = 0;
        while (number != 0) {
            number /= 10;
            digits++;
        }
        System.out.println(digits);
    }
}
