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
        String[][] Smatrix = new String[rowsCount][columnsCount];
        int i = 0;
        for (String row: rows) {
            String[] digits = row.split(" "); //digits per row
            Smatrix[i] = digits;
            i++;
        }

        for(i=0; i<rowsCount; i++) {
            for(int j=0; j<columnsCount; j++){
                matrix[i][j] = Integer.parseInt(Smatrix[i][j]);
            }
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
}
