package com.codes.java.matrices;

class Addition extends Operations {
    public static double[][] Add(double[][] M1, double[][] M2) {
        int OrderRow1 = M1.length;
        int OrderColumn1 = M1[0].length;
        int OrderRow2 = M2.length;
        int OrderColumn2 = M2[0].length;
        if (OrderRow1 == OrderRow2 && OrderColumn1 == OrderColumn2) {
            double[][] Result = new double[OrderRow1][OrderColumn2];
            for (int i = 0; i < OrderRow1; i++) {
                for (int j = 0; j < OrderColumn2; j++) {
                    Result[i][j] = M1[i][j] + M2[i][j];
                }
            }
            return Result;
        } else {
            System.out.println("Please recheck the given matrices.");
            return null;
        }
    }
}
