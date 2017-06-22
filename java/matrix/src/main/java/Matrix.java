import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by roxana on 6/21/17.
 */
public class Matrix {
    private int[][] matrix;
    private int rowsCount;
    private int columnsCount;

    public Matrix(String matrixAsString) {
        String[] rows = matrixAsString.split("\n");
        columnsCount = rows[0].split(" ").length;
        rowsCount = rows.length;
        matrix = new int[rowsCount][columnsCount];
        for(int i=0; i<rowsCount; i++) {
            String[] digits = rows[i].split(" ");
            for(int j=0; j<columnsCount; j++){
                matrix[i][j] = Integer.parseInt(digits[j]);
            }
        }
    }

    public void print() {
        for(int i=0; i<rowsCount; i++) {
            for(int j=0; j<columnsCount; j++){
                System.out.println(matrix[i][j]);
            }
            System.out.println("\n");
        }
    }

    public int getRowsCount() {
        return rowsCount;
    }

    public int getColumnsCount() {
        return columnsCount;
    }

    public int[] getColumn(int index) {
        int[] column = new int[rowsCount];
        for(int i =0; i<rowsCount; i++) {
            column[i] = matrix[i][index];
        }
        return column;
    }

    public int[] getRow(int index) {
        return matrix[index];
    }

    public static void main(String[] args) {
        String matrixAsString = "1 2 3\n3 4 5\n";
        Matrix matrix = new Matrix(matrixAsString);
        matrix.print();
        System.out.println(Arrays.toString(matrix.getColumn(0)));
    }
}
