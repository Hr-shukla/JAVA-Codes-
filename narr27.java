class narr27 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int evenCount = 0, oddCount = 0;
        for (int i : array) {
            if (i % 2 == 0) evenCount++;
            else oddCount++;
        }
        System.out.println("Even: " + evenCount + " Odd: " + oddCount);
    }
}
