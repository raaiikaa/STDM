import GeneratorAndPrinter.Generator;
import GeneratorAndPrinter.Printer;

public class ArraySort {
    public static void main(String[] args) {
        Generator arrayGenerator = new Generator();
        Printer printer = new Printer();

        int[] randomArray = arrayGenerator.getRandomIntArrayWithSize(10);
        printer.printIntArray(randomArray);

        System.out.println("");

        printer.printIntArray(sortArray(randomArray));
    }

    static int[] sortArray(int[] inputArray) {
        int actualPositon = 0;
        int positionOfSmallest = 1000;
        int cache;
        int[] sortedArray = inputArray;

        for (int i = 0; i < sortedArray.length; i++) {
            int smallestNumber = sortedArray[i];
            actualPositon = i;
            positionOfSmallest = i;

            for (int j = i; j < sortedArray.length; j++)
                if (sortedArray[j] < sortedArray[i] && sortedArray[j] < smallestNumber) {
                    smallestNumber = sortedArray[j];
                    positionOfSmallest = j;
                }

            cache = sortedArray[actualPositon];
            sortedArray[actualPositon] = sortedArray[positionOfSmallest];
            sortedArray[positionOfSmallest] = cache;
        }
        return sortedArray;
    }
}
