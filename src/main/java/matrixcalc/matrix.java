package matrixcalc;

public class matrix {
public int[][] add(int[][] A, int[][] B)
    {
        if (A.length != B.length || A[0].length != B[0].length)
        {
            throw new IllegalArgumentException("Матрицы неравны");
        }
        int C[][] = new int[A.length][A.length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A.length; j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;

    }

    public int[][] multiplyByNumber(int[][] A, int num)
    {
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A.length; j++)
                A[i][j] = A[i][j] * num;
        return A;
    }
}
