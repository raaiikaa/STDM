package Sudoku;

import GeneratorAndPrinter.Generator;
import GeneratorAndPrinter.Printer;

public class Sudoku {

    public static void main(String[] args) {
        Generator generator = new Generator();
        Printer printer = new Printer();

        String string = "003020600900305001001806400008102900700000008006708200002609500800203009005010300";
        int[][] integers = generator.generate2DimIntArrayForSudoku(string);

        printer.print2DimIntArrayAsSudoku(integers);
    }
}
