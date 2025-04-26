class sumon12 {
    public static void main(String[] args) {
        int N = 100, oddSum = 0;
        int i = 1;
        while (i <= N) {
            if (i % 2 != 0) {
                oddSum += i;
            }
            i++;
        }
        System.out.println(oddSum);
    }
}
