class sumodd67 {
    public static void main(String[] args) {
        int N = 10;
        int sum = 0;
        for (int i = 1; i <= N; i += 2) {
            sum += i;
        }
        System.out.println("Sum of first " + N + " odd numbers: " + sum);
    }
}
