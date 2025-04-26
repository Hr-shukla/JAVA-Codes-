class numdig57 {
    public static void main(String[] args) {
        int[] arr = {123, 456, 789};
        int totalDigits = 0;
     for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            while (num != 0) {
                num /= 10;
                totalDigits++;
            }
        }
        System.out.println("Total digits: " + totalDigits);
    }
}
