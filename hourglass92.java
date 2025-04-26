class hourglass92 {
    public static void main(String[] args) {
        int N = 5;
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
