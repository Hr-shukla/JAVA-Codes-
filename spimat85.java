class spimat85 {
    public static void main(String[] args) {
        int N = 4;
        int[][] matrix = new int[N][N];
        int value = 1, top = 0, bottom = N - 1, left = 0, right = N - 1;
        while (value <= N * N) {
            for (int i = left; i <= right; i++) matrix[top][i] = value++;
            top++;
            for (int i = top; i <= bottom; i++) matrix[i][right] = value++;
            right--;
            for (int i = right; i >= left; i--) matrix[bottom][i] = value++;
            bottom--;
            for (int i = bottom; i >= top; i--) matrix[i][left] = value++;
            left++;
        }
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
