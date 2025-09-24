package GeneratorAndPrinter;

import java.util.ArrayList;

public class Printer {

    public void printIntArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
            if(i < array.length - 1)
            System.out.print(",");
        }
    }

    public void printIntArrayList(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
            if (i < arrayList.size() - 1)
                System.out.print(",");
        }
    }

    public void print2DimIntArray(int[][] array) {
        String finalString = new String();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                finalString += Integer.valueOf(array[i][j]);
            }
            System.out.println(finalString);
        }
    }

    public void print2DimIntArrayAsBingo(int[][] array) {
        String finalString = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                finalString += "  " + Integer.valueOf(array[i][j]);
            }
            System.out.println(finalString);
            finalString = "";
        }
    }
}
