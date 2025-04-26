class smallarr68 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9};
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest element: " + smallest);
    }
}
