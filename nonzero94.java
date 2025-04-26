class nonzero94 {
    public static void main(String[] args) {
        int num = 102030405;
        int nonZeroDigits = 0;
        while (num != 0) {
            if (num % 10 != 0) {
                nonZeroDigits++;
            }
            num /= 10;
        }
        System.out.println("Number of non-zero digits: " + nonZeroDigits);
    }
}
