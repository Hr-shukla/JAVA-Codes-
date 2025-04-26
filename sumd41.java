class sumd41 {
    public static void main(String[] args) {
        int number = 123456, sum = 0, position = 1;
        while (number != 0) {
            int digit = number % 10;
            if (position % 2 == 0) {
                sum += digit;
            }
            number /= 10;
            position++;
        }
        System.out.println(sum);
    }
}
