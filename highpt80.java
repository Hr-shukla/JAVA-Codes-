class highpt80 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 7, 0};
        int maxProduct = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int product = arr[i] * arr[j];
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }
        System.out.println("Highest product: " + maxProduct);
    }
}
