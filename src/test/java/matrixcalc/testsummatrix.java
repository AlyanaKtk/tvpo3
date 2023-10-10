package matrixcalc;

import junit.framework.TestCase;
import org.junit.Test;

public class testsummatrix extends TestCase {

    @Test
    public void testMatrixSum()
    {
        int[][] matrixA = {{1, 2, 3}, {4,7,9}, {8, 11, 0}};
        int[][] matrixB = {{8, 13, 3}, {5,0,9}, {14, 1, 8}};
        matrix mtrx = new matrix();
        int[][] matrixCAnswer = {{9, 15, 6}, {9, 7, 18}, {22, 12, 8}};
        int[][] matrixC = mtrx.add(matrixA, matrixB);
        for (int i = 0; i < matrixA.length; i++)
            for (int j = 0; j < matrixA.length; j++)
                assertEquals(matrixC[i][j], matrixCAnswer[i][j]);


    }


}