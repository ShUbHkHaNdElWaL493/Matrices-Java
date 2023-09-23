package com.codes.java.matrices;

class Printer extends Features {
    public static void MatrixPrinter(double[][] M) {
        if (M == null) {
            System.exit(0);
        }
        System.out.println("");
        System.out.println("The matrix is as follows:");
        int OrderRow = M.length;
        int OrderColumn = M[0].length;
        for (int i = 0; i < OrderRow; i++) {
            System.out.print("|");
            System.out.print(" ");
            for (int j = 0; j < OrderColumn; j++) {
                System.out.print(M[i][j]);
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
