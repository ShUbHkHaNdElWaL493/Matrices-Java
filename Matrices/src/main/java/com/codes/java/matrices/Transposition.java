package com.codes.java.matrices;

class Transposition extends Operations {
    public static double[][] Transpose(double[][] M) {
        int OrderRow = M.length;
        int OrderColumn = M[0].length;
        double[][] Result = new double[OrderColumn][OrderRow];
        for (int i = 0; i < OrderRow; i++) {
            for (int j = 0; j < OrderColumn; j++) {
                Result[j][i] = M[i][j];
            }
        }
        return Result;
    }
}
