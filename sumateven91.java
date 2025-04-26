class sumateven91 {
    public static void main(String[] args) {
        int num = 123456;
        int sum = 0;
        String numStr = Integer.toString(num);
        for (int i = 0; i < numStr.length(); i++) {
            if (i % 2 == 0) {
                sum += Character.getNumericValue(numStr.charAt(i));
            }
        }
        System.out.println("Sum of digits at even indexes: " + sum);
    }
}
