package lesson15.atHome.ex2;

public class Matrix<T extends Number> {
    private T[][] twoDimMatrix;
    private int numOfRows;
    private int numOfColumns;

    public Matrix(T[][] aTwoDimMatrix) {
        twoDimMatrix = aTwoDimMatrix.clone();
        numOfRows = twoDimMatrix.length;
        numOfColumns = twoDimMatrix[0].length;
    }

    public T getElement(int x, int y) {
        return twoDimMatrix[x][y];
    }

    public int getRows() {
        return numOfRows;
    }

    public int getColumns() {
        return numOfColumns;
    }

    public void setElement(int x, int y, T element) {
        twoDimMatrix[x][y] = element;
    }

    private Number returnAdding(Matrix m1, Matrix m2, int i, int j) {
        if (m1.twoDimMatrix instanceof Integer[][] && m2.twoDimMatrix instanceof Integer[][]) {
            return m1.getElement(i, j).intValue() + m2.getElement(i, j).intValue();
        } else if (m1.twoDimMatrix instanceof Long[][] && m2.twoDimMatrix instanceof Long[][]) {
            return m1.getElement(i, j).longValue() + m2.getElement(i, j).longValue();
        } else if (m1.twoDimMatrix instanceof Double[][] && m2.twoDimMatrix instanceof Double[][]) {
            return m1.getElement(i, j).doubleValue() + m2.getElement(i, j).doubleValue();
        } else if (m1.twoDimMatrix instanceof Short[][] && m2.twoDimMatrix instanceof Short[][]) {
            return m1.getElement(i, j).shortValue() + m2.getElement(i, j).shortValue();
        } else if (m1.twoDimMatrix instanceof Float[][] && m2.twoDimMatrix instanceof Float[][]) {
            return m1.getElement(i, j).floatValue() + m2.getElement(i, j).floatValue();
        } else {
            return m1.getElement(i, j).byteValue() + m2.getElement(i, j).byteValue();
        }
    }

    public void addOfMatrix(Matrix<?> anotherMatrix) {
        if (numOfRows == anotherMatrix.getRows() && numOfColumns == anotherMatrix.getColumns()) {
            for (int i = 0; i < numOfRows; i++) {
                for (int j = 0; j < twoDimMatrix[0].length; j++) {
                    setElement(i, j, (T) returnAdding(this, anotherMatrix, i, j));
                }
            }
        } else {
            System.out.println("Dimensions of matrices are not equal");
        }

    }

    private Number returnMultiplying(Matrix m, Number n, int i, int j) {
        if (m.twoDimMatrix instanceof Integer[][]) {
            return m.getElement(i, j).intValue() * n.intValue();
        } else if (m.twoDimMatrix instanceof Double[][]) {
            return m.getElement(i, j).doubleValue() * n.doubleValue();
        } else if (m.twoDimMatrix instanceof Long[][]) {
            return m.getElement(i, j).longValue() * n.longValue();
        } else if (m.twoDimMatrix instanceof Short[][]) {
            return m.getElement(i, j).shortValue() * n.shortValue();
        } else if (m.twoDimMatrix instanceof Float[][]) {
            return m.getElement(i, j).floatValue() * n.floatValue();
        } else {
            return m.getElement(i, j).byteValue() * n.byteValue();
        }
    }

    public void multiplyByTheNumber(Number number) {
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfColumns; j++) {
                twoDimMatrix[i][j] = (T) returnMultiplying(this, number, i, j);
            }
        }
    }

    private static Number getNumber(Matrix m1, Matrix m2, Number n, int i, int j, int k) {
        if (m1.twoDimMatrix instanceof Integer[][] && m2.twoDimMatrix instanceof Integer[][]) {
            return n.intValue() + m1.getElement(i, j).intValue() * m2.getElement(k, i).intValue();
        } else if (m1.twoDimMatrix instanceof Float[][] && m2.twoDimMatrix instanceof Float[][]) {
            return n.doubleValue() + m1.getElement(i, j).floatValue() * m2.getElement(k, i).floatValue();
        } else if (m1.twoDimMatrix instanceof Long[][] && m2.twoDimMatrix instanceof Long[][]) {
            return n.longValue() + m1.getElement(i, j).longValue() * m2.getElement(k, i).longValue();
        } else if (m1.twoDimMatrix instanceof Double[][] && m2.twoDimMatrix instanceof Double[][]) {
            return n.doubleValue() + m1.getElement(i, j).doubleValue() * m2.getElement(k, i).doubleValue();
        } else if (m1.twoDimMatrix instanceof Byte[][] && m2.twoDimMatrix instanceof Byte[][]) {
            return n.byteValue() + m1.getElement(i, j).byteValue() * m2.getElement(k, i).byteValue();
        } else {
            return n.shortValue() + m1.getElement(i, j).shortValue() * m2.getElement(k, i).shortValue();
        }
    }

    private void setVal(Matrix m, Number n, int i, int j) {
        if (m.twoDimMatrix instanceof Integer[][]) {
            m.setElement(i, j, n.intValue());
        } else if (m.twoDimMatrix instanceof Double[][]) {
            m.setElement(i, j, n.doubleValue());
        } else if (m.twoDimMatrix instanceof Short[][]) {
            m.setElement(i, j, n.shortValue());
        } else if (m.twoDimMatrix instanceof Long[][]) {
            m.setElement(i, j, n.longValue());
        } else if (m.twoDimMatrix instanceof Float[][]) {
            m.setElement(i, j, n.floatValue());
        } else {
            m.setElement(i, j, n.byteValue());
        }
    }

    public void matrixMultiplication(Matrix<?> anotherMatrix) {
        if (numOfRows == anotherMatrix.getColumns()) {
            for (int i = 0; i < twoDimMatrix.length; i++) {
                for (int j = 0; j < twoDimMatrix[0].length; j++) {
                    Number temp = 0;
                    for (int k = 0; k < anotherMatrix.numOfRows; k++) {
                        temp = getNumber(this, anotherMatrix, temp, i, j, k);
                    }
                    setVal(this, temp, i, j);
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
        Matrix<Float> m = new Matrix(new Float[][]{{1f, 1f}, {1f, 1f}});
        m.printMatrix();
        m.matrixMultiplication(new Matrix(new Integer[][]{{1, 1}, {1, 1}}));
        m.printMatrix();
        m.multiplyByTheNumber((float) 5);
        m.printMatrix();
        m.addOfMatrix(m);
        m.printMatrix();
    }
}
