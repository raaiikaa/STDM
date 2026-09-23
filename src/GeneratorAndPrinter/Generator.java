package GeneratorAndPrinter;

public class Generator {

    public int[] getRandomIntArrayWithSize(int size, int sizeOfNumbers){
        int[] generatedArray = new int[size];

        for(int i=0; i<size; i++){
            int randomNumber = (int) (Math.random() * sizeOfNumbers);
            generatedArray[i] = randomNumber;
        }
        return generatedArray;
    }

    public int[][] generate2DimIntArrayForSudoku(String stringOfInts) {

        int[][] integerArray = new int[9][9];

        int spalte = 0;
        int reihe = 0;

        for (int i = 1; i <= stringOfInts.length(); i++) {
            Integer integer = Character.getNumericValue(stringOfInts.charAt(i - 1));

            if (integer != null) {
                integerArray[reihe][spalte] = integer;
                spalte++;
                if (spalte == 9) {
                    reihe++;
                    spalte = 0;
                }
            }
        }

        return integerArray;
    }
}
