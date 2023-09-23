package com.codes.java.matrices;

import java.util.Scanner;

class Operations extends Matrices {
    public static String Choice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("The following operations can be performed:");
        System.out.println("Enter 'Add' for performing addition.");
        System.out.println("Enter 'Subtract' for performing subtracton.");
        System.out.println("Enter 'Multiply' for performing multiplication.");
        System.out.println("Enter 'Transpose' to get the transpose of the matrix.");
        return sc.nextLine();
    }
}
