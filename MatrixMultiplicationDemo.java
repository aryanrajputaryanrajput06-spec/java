public class MatrixMultiplicationDemo {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] product = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Matrix multiplication result:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
