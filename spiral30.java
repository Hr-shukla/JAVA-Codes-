class spiral30 {
    public static void main(String[] args) {
        int n = 4;
        int[][] spiral = new int[n][n];
        int value = 1, top = 0, bottom = n - 1, left = 0, right = n - 1;
        while (value <= n * n) {
            for (int i = left; i <= right; i++) spiral[top][i] = value++;
            top++;
            for (int i = top; i <= bottom; i++) spiral[i][right] = value++;
            right--;
            for (int i = right; i >= left; i--) spiral[bottom][i] = value++;
            bottom--;
            for (int i = bottom; i >= top; i--) spiral[i][left] = value++;
            left++;
        }
        for (int[] row : spiral) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
