class stpalin21 {
    public static void main(String[] args) {
        String original = "madam";
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        System.out.println(original.equals(reverse));
    }
}
