class onldig54 {
    public static void main(String[] args) {
        String str = "12345";
        boolean onlyDigits = true;
           for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                onlyDigits = false;
                break;
            }
        }

        System.out.println(onlyDigits);
    }
}
