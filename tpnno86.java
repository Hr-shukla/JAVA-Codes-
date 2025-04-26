class tpnno86 {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, 6};
        int positiveCount = 0, negativeCount = 0;
           for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) positiveCount++;
            else if (arr[i] < 0) negativeCount++;
        }
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
    }
}
