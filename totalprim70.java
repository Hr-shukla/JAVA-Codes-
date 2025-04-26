class totalprim70 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 5, 9, 7, 11};
        int primeCount = 0;
         for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                primeCount++;
            }
        }
        System.out.println("Number of prime numbers: " + primeCount);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
