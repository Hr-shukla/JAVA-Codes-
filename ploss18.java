class ploss18 {
    public static void main(String[] args) {
        int costPrice = 1000, sellingPrice = 1200;
        if (sellingPrice > costPrice) {
            System.out.println("Profit = " + (sellingPrice - costPrice));
        } else if (sellingPrice < costPrice) {
            System.out.println("Loss = " + (costPrice - sellingPrice));
        } else {
            System.out.println("No profit, no loss");
        }
    }
}
