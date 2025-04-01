import GeneratorAndPrinter.Printer;

public class ArrayUnite {
    public static void main(String[] args) {
        Printer arrayPrinter = new Printer();

        int[] a = {5,7,11,19,23,29,31,34,46};
        int[] b = {2,4,8,16,17,18,20,30,50};

        int[] result = unite(a,b);

        arrayPrinter.printIntArray(result);

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
}
