package com.codes.java.matrices;

import java.util.Scanner;

class Reader extends Features {
    public static double[][] MatrixReader() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter the row length of the matrix.");
        String a1 = sc.nextLine();
        int OrderRow = Integer.parseInt(a1);
        System.out.println("");
        System.out.println("Enter the column length of the matrix.");
        String a2 = sc.nextLine();
        System.out.println("");
        int OrderColumn = Integer.parseInt(a2);
        double[][] Matrix = new double[OrderRow][OrderColumn];
        for (int i = 0; i < OrderRow; i++) {
            for (int j = 0; j < OrderColumn; j++) {
                System.out.println("Enter the element 'a" + (i + 1) + "" + (j + 1) + ".'");
                String a3 = sc.nextLine();
                Matrix[i][j] = Double.parseDouble(a3);
            }
        }
        return Matrix;
    }
}
