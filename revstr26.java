class revstr26 {
    public static void main(String[] args) {
        String original = "hello";
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        System.out.println(reverse);
    }
}
