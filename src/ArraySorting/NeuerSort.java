package ArraySorting;

import GeneratorAndPrinter.Generator;
import GeneratorAndPrinter.Printer;

//funktioniert noch nicht!!

public class NeuerSort {
    public int MAGIC_NUMBER = 100;

    public static void main(String[] args) {
        Generator arrayGenerator = new Generator();
        Printer arrayPrinter = new Printer();

        int[] randomArray = arrayGenerator.getRandomIntArrayWithSize(10, 100);
        arrayPrinter.printIntArray(randomArray);

        System.out.println();

        int[] sortedArray = sortArray(randomArray);
        arrayPrinter.printIntArray(sortedArray);
    }

    private static int[] sortArray(int[] array) {
        int cache;
        int[] sortedArray = array;

        //findSmallestNumber();

        for(int i=1; i< sortedArray.length; i++){

        }

        return sortedArray;
    }

    private static int findSmallestNumber(int[] array) {
        int smallestNumber =  0;

        for(int i=0; i<array.length; i++){
            if(array[i]<smallestNumber){
                smallestNumber = array[i];
            }
        }

        return smallestNumber;
    }


}
