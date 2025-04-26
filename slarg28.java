class slarg28 {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8};
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
       for (int i = 0; i < array.length; i++) {
    if (array[i] > largest) {
        secondLargest = largest;
        largest = array[i];
    } else if (array[i] > secondLargest && array[i] != largest) {
        secondLargest = array[i];
    }
}
        System.out.println(secondLargest);
    }
}
