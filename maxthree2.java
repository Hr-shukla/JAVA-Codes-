class maxthree2 {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 7;
        if (a >= b && a >= c) {
            System.out.println("Maximum: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Maximum: " + b);
        } else {
            System.out.println("Maximum: " + c);
        }
    }
}
