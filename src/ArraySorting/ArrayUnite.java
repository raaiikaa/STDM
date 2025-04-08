package ArraySorting;

import GeneratorAndPrinter.Generator;
import GeneratorAndPrinter.Printer;

public class ArrayUnite {
    public static void main(String[] args) {
        Printer arrayPrinter = new Printer();
        Generator arrayGenerator = new Generator();

        int[] a = {5,7,11,19,23,29,31,34,46};
        int[] b = {2,4,8,16,17,18,20,30,50};

        int[] c = arrayGenerator.getRandomIntArrayWithSize(10, 10);

        int[] result = unite(a,b);

        System.out.println("United Array:");
        arrayPrinter.printIntArray(result);
        System.out.println();

        System.out.println("\nOrignal Array:");
        arrayPrinter.printIntArray(c);
        System.out.println("\nMergeSorted Array:");
        arrayPrinter.printIntArray(mergeSort(c));

    }

    static int[] unite(int[] a, int[] b){
        int counterA = 0;
        int counterB = 0;

        int[] result = new int[a.length + b.length];

        boolean aIsDone = false;
        boolean bIsDone = false;

        int i = 0;
        while(i < result.length){
            while(!aIsDone && !bIsDone){
                if(a[counterA] < b[counterB]){
                    result[i] = a[counterA];
                    counterA ++;
                }else if(b[counterB] < a[counterA]){
                    result[i] = b[counterB];
                    counterB ++;
                }
                if(counterA ==  a.length){
                    aIsDone = true;
                }

                if(counterB ==  b.length){
                    bIsDone = true;
                }

                i ++;
            }
            if(aIsDone){
                result[i] = b[counterB];
                counterB ++;
                i++;
            }else if(bIsDone){
                result[i] = a[counterA];
                counterA ++;
                i++;
            }
        }

        return result;
    }

    //funktioniert noch nicht
    static int[] mergeSort(int[] array){
        int laenge = array.length;
        if(laenge < 2){
            return array;
        }

        int[] links, rechts;
        links = new int[laenge/2];
        rechts = new int[laenge - laenge/2];

        int counter = 0;

        for(int i = 0; i<links.length; i++){
            links[i] = array[i];
            counter = i;
        }

        for(int j = 0; j<links.length; j++){
            counter ++;
            rechts[j] = array[counter];
        }

        links = mergeSort(links);
        rechts = mergeSort(rechts);

        int[] ergebnis = unite(links, rechts);
        return ergebnis;
    }
}
