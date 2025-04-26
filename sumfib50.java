class sumfib50 {
    public static void main(String[] args) {
        int n = 10, sum = 0;
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(sum);
    }
}
