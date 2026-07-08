public class MatrixOperations {

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10) + 1; // 1 to 10
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] addMatrices(int[][] m1, int[][] m2) {
        int rows = m1.length, cols = m1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) result[i][j] = m1[i][j] + m2[i][j];
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] m1, int[][] m2) {
        int rows = m1.length, cols = m1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) result[i][j] = m1[i][j] - m2[i][j];
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] m1, int[][] m2) {
        int r1 = m1.length, c1 = m1[0].length, c2 = m2[0].length;
        int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] findTranspose(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) transpose[j][i] = matrix[i][j];
        }
        return transpose;
    }

    public static int determinant2x2(int[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    public static int determinant3x3(int[][] m) {
        int x = m[0][0] * ((m[1][1] * m[2][2]) - (m[1][2] * m[2][1]));
        int y = m[0][1] * ((m[1][0] * m[2][2]) - (m[1][2] * m[2][0]));
        int z = m[0][2] * ((m[1][0] * m[2][1]) - (m[1][1] * m[2][0]));
        return x - y + z;
    }

    public static double[][] inverse2x2(int[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;
        return inv;
    }

    public static void main(String[] args) {
        int[][] m1 = createRandomMatrix(2, 2);
        int[][] m2 = createRandomMatrix(2, 2);

        System.out.println("Matrix 1:");
        displayMatrix(m1);
        System.out.println("Matrix 2:");
        displayMatrix(m2);

        System.out.println("Addition:");
        displayMatrix(addMatrices(m1, m2));

        System.out.println("Determinant of M1: " + determinant2x2(m1));
    }
}
