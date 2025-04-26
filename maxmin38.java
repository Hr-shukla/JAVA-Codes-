class maxmin38 {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 5, 4};
        int max = array[0], min = array[0];
     for (int i = 0; i < array.length; i++) {
    if (array[i] > max) max = array[i];
    if (array[i] < min) min = array[i];
}

        System.out.println("Max: " + max + " Min: " + min);
    }
}
