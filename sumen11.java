class sumen11 {
    public static void main(String[] args) {
        int N = 100, evenSum = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        System.out.println(evenSum);
    }
}
