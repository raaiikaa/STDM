public class MagischesViereck {
    static int[][] testDaten = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
    static int[][] tD2 = {{9, 2, 4}, {5, 7, 3}, {1, 6, 8}};
    static int[][] tD3 = {{5, 10, 3}, {4, 6, 8}, {9, 2, 7}};
    static int[][] tD4 = {{5, 1, 9, 3}, {4, 6, 8}, {9, 2, 7}};
    static int[][] tD5 = {{1, 15, 14, 4}, {12, 6, 7, 9}, {8, 10, 11, 5}, {13, 3, 2, 16}};

    public static void main(String[] args) {
        int[][] array = tD5;
        printMQ(array);
        System.out.println(isMagic(array));
    }

    public static void printMQ(int[][] mq) {
        for (int i = 0; i < mq.length; i++) {
            for (int j = 0; j < mq[i].length; j++) {
                System.out.print(mq[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createMagischesViereck(int size){
        int[][] resultArray = new int[size][size];
        int[] position = new int[2];
        int countUp = 1;

        resultArray[0][size/2] = countUp;

        while(countUp <= size * 2){
            if(position[0] == 0){
                position[0] = size;
                position[1] = position[1] + 1;
            }else if(position[1] == resultArray.length){
                
            }
        }


        return resultArray;
    }

    public static boolean isMagic(int[][] mq) {
        boolean isMagic;
        int solution = 0;
        int sum = 0;
        for (int i = 0; i < mq[1].length; i++) {
            solution += mq[0][i];
        }

        for (int i = 0; i < mq.length; i++) {
            for (int j = 0; j < mq[i].length; j++) {
                sum += mq[i][j];
            }
            if (sum == solution) {
                isMagic = true;
                sum = 0;
            } else {
                return false;
            }
        }

        for (int i = 0; i < mq.length; i++) {
            for (int j = 0; j < mq[i].length; j++) {
                sum += mq[j][i];
            }
            if (sum == solution) {
                isMagic = true;
                sum = 0;
            } else {
                return false;
            }
        }

        for (int j = 0; j < mq.length; j++) {
            sum += mq[j][j];
        }
        if (sum == solution) {
            isMagic = true;
            sum = 0;
        } else {
            return false;
        }

        int index1 = 0;
        int index2 = mq.length;

        for (int j = 0; j < mq.length; j++) {
            sum += mq[index1][index2 - 1];
            index1 += 1;
            index2 -= 1;
        }
        if (sum == solution) {
            isMagic = true;
            sum = 0;
        } else {
            return false;
        }
        return isMagic;
    }
}
