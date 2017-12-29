package lesson7.exercise3;

public class Matrix {
    private float[][] twoDimMatrix;
    private int numOfRows;
    private int numOfColumns;

    public Matrix(float[][] aTwoDimMatrix) {
        twoDimMatrix = aTwoDimMatrix;
        numOfRows = twoDimMatrix.length;
        numOfColumns = twoDimMatrix[0].length;
    }

    public float getElement(int x, int y) {
        return twoDimMatrix[x][y];
    }

    public int getRows() {
        return numOfRows;
    }

    public int getColums() {
        return numOfColumns;
    }

    public void setElement(int x, int y, float element) {
        twoDimMatrix[x][y] = element;
    }

    public void addOfMatrix(Matrix anotherMatrix) {
        if (numOfRows == anotherMatrix.getRows() && numOfColumns == anotherMatrix.getColums()) {
            for (int i = 0; i < numOfRows; i++) {
                for (int j = 0; j < twoDimMatrix[0].length; j++) {
                    twoDimMatrix[i][j] += anotherMatrix.getElement(i, j);
                }
            }
        } else {
            System.out.println("Dimensions of matrices are not equal");
        }
    }

    public void multiplyByTheNumber(int number) {
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfColumns; j++) {
                twoDimMatrix[i][j] *= number;
            }
        }
    }

    public void matrixMultiplication(Matrix anotherMatrix) {
        if (numOfRows == anotherMatrix.getColums()) {
            for (int i = 0; i < twoDimMatrix.length; i++) {
                for (int j = 0; j < twoDimMatrix[0].length; j++) {
                    int temp = 0;
                    for (int k = 0; k < anotherMatrix.numOfRows; k++) {
                        temp += twoDimMatrix[i][j] * anotherMatrix.getElement(k, i);
                    }
                    twoDimMatrix[i][j] = temp;

                }
            }
        } else {
            System.out.println("Dimensions of matrices are not equal");
        }
    }

    public void printMatrix() {
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfColumns; j++) {
                System.out.print(twoDimMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Matrix m = new Matrix(new float[][]{{1, 1}, {1, 1}});
        m.printMatrix();
        m.matrixMultiplication(new Matrix(new float[][]{{1, 1}, {1, 1}}));
        m.printMatrix();
        m.multiplyByTheNumber(5);
        m.printMatrix();
        m.addOfMatrix(m);
        m.printMatrix();
    }
}
