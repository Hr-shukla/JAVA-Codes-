class persq88 {
    public static void main(String[] args) {
        int N = 20;
        int perfectSquaresCount = 0;
        for (int i = 1; i * i <= N; i++) {
            perfectSquaresCount++;
        }
        System.out.println("Number of perfect squares up to " + N + ": " + perfectSquaresCount);
    }
}
