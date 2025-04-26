class pow77 {
    public static void main(String[] args) {
        int num = 16;
        if (isPowerOfTwo(num)) {
            System.out.println(num + " is a power of two");
        } else {
            System.out.println(num + " is not a power of two");
        }
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        while (n != 1) {
            if (n % 2 != 0) return false;
            n = n / 2;
        }
        return true;
    }
}
