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
}
