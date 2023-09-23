package com.codes.java.matrices;

class Multiplication extends Operations {
    public static double[][] Multiply(double[][] M1, double[][] M2) {
        int OrderRow1 = M1.length;
        int OrderColumn1 = M1[0].length;
        int OrderRow2 = M2.length;
        int OrderColumn2 = M2[0].length;
        if (OrderRow1 == OrderColumn2) {
            double[][] Result = new double[OrderRow2][OrderColumn1];
            for (int i = 0; i < OrderColumn1; i++) {
                for (int j = 0; j < OrderRow2; j++) {
                double TempSum = 0;
                    for (int k = 0; k < OrderRow1; k++) {
                        TempSum += M1[k][i] * M2[j][k];
                    }
                Result[j][i] = TempSum;
                }
            }
            return Result;
        } else {
            System.out.println("Please recheck the given matrices.");
            return null;
        }
    }
}
