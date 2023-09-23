/* You are using Matrices.
   For using this program, enter the
   operation you want to perform as well as the
   corresponding matrices.
   The program will then print the resulting matrix.
*/
package com.codes.java.matrices;

public class Matrices {

    public static void main(String[] args) {
        System.out.println("Enter the operation you want to perform.");
        String Choice = Operations.Choice();
        System.out.println("");
        
        switch (Choice) {
            case "Add" -> {
                System.out.println("Enter the first matrix.");
                double[][] Matrix1 = Reader.MatrixReader();
                System.out.println("");
                System.out.println("Enter the second matrix.");
                double[][] Matrix2 = Reader.MatrixReader();
                double[][] Result = Addition.Add(Matrix1, Matrix2);
                Printer.MatrixPrinter(Result);
            }
            case "Subtract" -> {
                System.out.println("Enter the first matrix.");
                double[][] Matrix1 = Reader.MatrixReader();
                System.out.println("Enter the second matrix.");
                double[][] Matrix2 = Reader.MatrixReader();
                double[][] Result = Subtraction.Subtract(Matrix1, Matrix2);
                Printer.MatrixPrinter(Result);
            }
            case "Multiply" -> {
                System.out.println("Enter the first matrix.");
                double[][] Matrix1 = Reader.MatrixReader();
                System.out.println("Enter the second matrix.");
                double[][] Matrix2 = Reader.MatrixReader();
                double[][] Result = Multiplication.Multiply(Matrix1, Matrix2);
                Printer.MatrixPrinter(Result);
            }
            case "Transpose" -> {
                System.out.println("Enter the matrix.");
                double[][] Matrix = Reader.MatrixReader();
                double[][] Result = Transposition.Transpose(Matrix);
                Printer.MatrixPrinter(Result);
            }
            default -> {
                System.out.println("Please choose one of the available operations only.");
            }
        }
    }
}
