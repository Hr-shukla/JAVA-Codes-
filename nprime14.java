class nprime14 {
    public static void main(String[] args) {
        int primeCheck = 29;
        System.out.println(isPrime(primeCheck));
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
